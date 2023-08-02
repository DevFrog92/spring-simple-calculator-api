package com.example.calc.domain.calculator.domain.operator;

public interface ArithmeticOperator {
    boolean support(ArithmeticOperatorEnum operator);

    String calculate(long operand1, long operand2);
}
