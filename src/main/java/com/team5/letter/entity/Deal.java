package com.team5.letter.entity;

import com.team5.letter.dto.DealRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Deal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer price;

    public Deal(DealRequestDto requestDto) {
        this.name = requestDto.getName();
        this.price = requestDto.getPrice();
    }

}
