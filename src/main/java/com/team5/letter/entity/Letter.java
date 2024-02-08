package com.team5.letter.entity;

import com.team5.letter.dto.LetterRequestDto;
import com.team5.letter.dto.LetterResponseDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Letter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String content;

    public Letter(LetterRequestDto requestDto) {
        this.content = requestDto.getContent();
    }
}
