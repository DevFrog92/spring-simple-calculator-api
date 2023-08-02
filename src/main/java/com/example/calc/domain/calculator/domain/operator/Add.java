package com.example.calc.domain.calculator.domain.operator;

import static com.example.calc.domain.calculator.domain.operator.ArithmeticOperatorEnum.ADD;

public class Add implements ArithmeticOperator{
    @Override
    public boolean support(ArithmeticOperatorEnum operator) {
        return operator.equals(ADD);
    }

    @Override
    public String calculate(long operand1, long operand2) {
        return String.valueOf(operand1 + operand2);
    }
}
