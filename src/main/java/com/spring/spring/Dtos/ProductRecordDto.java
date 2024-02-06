package com.spring.spring.Dtos;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;

/**
 * ProductRecordDto
 */
public record ProductRecordDto(
    @NotBlank String name,
              BigDecimal value
    ) {

}