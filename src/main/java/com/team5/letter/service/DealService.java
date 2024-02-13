package com.team5.letter.service;

import com.team5.letter.dto.DealRequestDto;
import com.team5.letter.dto.DealResponseDto;
import com.team5.letter.entity.Deal;
import com.team5.letter.repository.DealRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DealService {
    private final DealRepository dealRepository;

    public List<DealResponseDto> receiveAll() {
        return dealRepository.findAll()
                .stream()
                .map(DealResponseDto::new)
                .toList();
    }

    public DealResponseDto create(DealRequestDto requestDto) {
        Deal deal = new Deal(requestDto);
        dealRepository.save(deal);
        return new DealResponseDto(deal);
    }
}