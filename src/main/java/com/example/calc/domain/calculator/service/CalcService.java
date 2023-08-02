package com.example.calc.domain.calculator.service;

import com.example.calc.domain.calculator.domain.Calculator;
import com.example.calc.domain.calculator.domain.operator.ArithmeticOperatorEnum;
import com.example.calc.domain.calculator.dto.CalcDto;
import com.example.calc.domain.calculator.dto.RequestDto;
import org.springframework.stereotype.Service;

@Service
public class CalcService {
    public CalcDto calculator(RequestDto requestDto){
        long operand1 = Long.parseLong(requestDto.getOperand1());
        long operand2 = Long.parseLong(requestDto.getOperand2());
        ArithmeticOperatorEnum operator =
                ArithmeticOperatorEnum
                        .valueOfLabel(requestDto.getOperator());

        String result = Calculator.calculate(operand1, operator, operand2);
        return CalcDto.builder()
                .result(result)
                .operand1(operand1)
                .operand2(operand2)
                .operator(operator.toString())
                .build();
    }
}
