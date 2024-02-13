package com.team5.letter.dto;

import com.team5.letter.entity.Deal;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class DealResponseDto {
    private Integer id;
    private String name;
    private Integer price;

    public DealResponseDto(Deal deal) {
        this.id = deal.getId();
        this.name = deal.getName();
        this.price = deal.getPrice();
    }
}