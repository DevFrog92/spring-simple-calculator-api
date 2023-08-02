package com.example.calc.domain.calculator.domain;

import com.example.calc.domain.calculator.domain.operator.*;

import java.util.Arrays;
import java.util.List;

public class Calculator {
    private static final List<ArithmeticOperator> operatorObj = Arrays.asList(
            new Add(),
            new Subtract(),
            new Multiply(),
            new Divide(),
            new Pow()
    );

    public static String calculate(long operand1,
                                ArithmeticOperatorEnum operator,
                                long operand2) {
        return operatorObj.stream()
                .filter(ob -> ob.support(operator))
                .map(ob -> ob.calculate(operand1, operand2))
                .findFirst()
                .orElseThrow(() ->
                        new IllegalArgumentException("지원하지 않는 연산자 입니다."));
    }
}
