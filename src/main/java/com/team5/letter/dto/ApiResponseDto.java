package com.team5.letter.dto;

import com.team5.letter.entity.Deal;

public class ApiResponseDto {
    private String name;
    private Integer price;

    public ApiResponseDto(String name, Integer price) {
        this.name = name;
        this.price = price;
    }
}
