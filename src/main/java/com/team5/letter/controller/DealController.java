package com.team5.letter.controller;


import com.team5.letter.dto.ApiResponseDto;
import com.team5.letter.dto.DealRequestDto;
import com.team5.letter.dto.DealResponseDto;
import com.team5.letter.service.DealService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DealController {
    private final DealService dealService;

    @GetMapping("/")
    public ResponseEntity<ApiResponseDto> home() {
        ApiResponseDto responseDto = new ApiResponseDto("check", 200);
        return ResponseEntity.ok(responseDto);
    }

    @PostMapping("/deals")
    public ResponseEntity<DealResponseDto> create(@RequestBody DealRequestDto requestDto) {
        DealResponseDto responseDto = dealService.create(requestDto);
        return ResponseEntity.ok(responseDto);
    }

    @GetMapping("/deals")
    public List<DealResponseDto> receiveAll() {
        List<DealResponseDto> responseDtos = dealService.receiveAll();
        return responseDtos;
    }
}
