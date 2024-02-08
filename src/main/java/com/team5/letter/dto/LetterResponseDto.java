package com.team5.letter.dto;

import com.team5.letter.entity.Letter;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LetterResponseDto {
    private Integer id;
    private String content;

    public LetterResponseDto(Letter letter) {
        this.id = letter.getId();
        this.content = letter.getContent();
    }
}