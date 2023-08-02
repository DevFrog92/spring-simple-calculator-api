package com.example.calc.domain.calculator.dto;

import com.example.calc.domain.calculator.domain.operator.ArithmeticOperatorEnum;
import com.example.calc.domain.calculator.validation.Enum;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class RequestDto {

        @NotEmpty(message = "{NotEmpty.field}")
        private String operand1;

        @NotEmpty(message = "{NotEmpty.field}")
        private String operand2;

        @NotEmpty@NotEmpty(message = "{NotEmpty.field}")
        @Enum(enumClass = ArithmeticOperatorEnum.class,
                ignoreCase = true,
                message = "{NotAllow.operator}")
        private String operator;
}
