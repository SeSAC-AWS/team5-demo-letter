package com.team5.letter.controller;


import com.team5.letter.dto.LetterRequestDto;
import com.team5.letter.dto.LetterResponseDto;
import com.team5.letter.service.LetterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class LetterController {
    private final LetterService letterService;

    @PostMapping("/letters")
    public ResponseEntity<LetterResponseDto> sendLetter(@RequestBody LetterRequestDto requestDto) {
        LetterResponseDto responseDto = letterService.sendLetter(requestDto);
        return ResponseEntity.ok(responseDto);
    }
}
