package com.example.calc.domain.calculator.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {
    private Integer statusCode;
    private String message;
    private Object body;
}
