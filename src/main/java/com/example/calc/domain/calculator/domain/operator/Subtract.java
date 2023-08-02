package com.example.calc.domain.calculator.domain.operator;


import static com.example.calc.domain.calculator.domain.operator.ArithmeticOperatorEnum.SUBTRACT;

public class Subtract implements ArithmeticOperator{
    @Override
    public boolean support(ArithmeticOperatorEnum operator) {
        return operator.equals(SUBTRACT);
    }

    @Override
    public String calculate(long operand1, long operand2) {
        return String.valueOf(operand1 - operand2);
    }
}
