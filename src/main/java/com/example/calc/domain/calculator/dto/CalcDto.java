package com.example.calc.domain.calculator.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
@NotEmpty
public class CalcDto {
    private String result;
    private long operand1;
    private long operand2;
    private String operator;
}
