package com.example.calc.domain.calculator.domain.operator;


import static com.example.calc.domain.calculator.domain.operator.ArithmeticOperatorEnum.MULTIPLY;

public class Multiply implements ArithmeticOperator{
    @Override
    public boolean support(ArithmeticOperatorEnum operator) {
        return operator.equals(MULTIPLY);
    }

    @Override
    public String calculate(long operand1, long operand2) {
        return String.valueOf(operand1 * operand2);
    }
}
