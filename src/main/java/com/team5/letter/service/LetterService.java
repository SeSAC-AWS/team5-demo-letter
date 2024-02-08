package com.team5.letter.service;

import com.team5.letter.dto.LetterRequestDto;
import com.team5.letter.dto.LetterResponseDto;
import com.team5.letter.entity.Letter;
import com.team5.letter.repository.LetterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LetterService {
    private final LetterRepository letterRepository;

    public LetterResponseDto sendLetter(LetterRequestDto requestDto) {
        Letter letter = new Letter(requestDto);
        letterRepository.save(letter);
        return new LetterResponseDto(letter);
    }
}