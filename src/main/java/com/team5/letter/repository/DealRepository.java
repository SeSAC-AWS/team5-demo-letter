package com.team5.letter.repository;

import com.team5.letter.entity.Deal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DealRepository extends JpaRepository<Deal, Integer> {
}
