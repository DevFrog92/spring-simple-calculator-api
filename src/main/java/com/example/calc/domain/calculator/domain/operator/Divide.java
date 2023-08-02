package com.example.calc.domain.calculator.domain.operator;

import com.example.calc.domain.calculator.exception.NotDividedByZeroException;

import static com.example.calc.domain.calculator.domain.operator.ArithmeticOperatorEnum.DIVIDE;

public class Divide implements ArithmeticOperator {
    @Override
    public boolean support(ArithmeticOperatorEnum operator) {
        return operator.equals(DIVIDE);
    }

    @Override
    public String calculate(long operand1, long operand2) {
        if (operand2 == 0) {
            throw new NotDividedByZeroException("0으로 나눌 수 없습니다.");
        }

        return String.valueOf((double) (operand1) / operand2);
    }
}
