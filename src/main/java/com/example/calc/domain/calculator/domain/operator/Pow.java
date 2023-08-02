package com.example.calc.domain.calculator.domain.operator;

import static com.example.calc.domain.calculator.domain.operator.ArithmeticOperatorEnum.POW;

public class Pow implements ArithmeticOperator{
    @Override
    public boolean support(ArithmeticOperatorEnum operator) {
        return operator.equals(POW);
    }

    @Override
    public String calculate(long operand1, long operand2) {
        long result = 1;

        while (operand2-- > 0) {
            result *= operand1;
        }

        return String.valueOf(result);
    }
}
