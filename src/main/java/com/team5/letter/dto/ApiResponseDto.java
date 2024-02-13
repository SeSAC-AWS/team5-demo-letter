package com.team5.letter.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ApiResponseDto {
    private String name;
    private Integer price;

    public ApiResponseDto(String name, Integer price) {
        this.name = name;
        this.price = price;
    }
}
