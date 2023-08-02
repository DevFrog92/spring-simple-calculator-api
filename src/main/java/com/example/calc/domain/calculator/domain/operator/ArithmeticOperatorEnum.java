package com.example.calc.domain.calculator.domain.operator;

import java.util.HashMap;
import java.util.Map;

public enum ArithmeticOperatorEnum {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    POW("^");

    private static final Map<String, ArithmeticOperatorEnum> label =
            new HashMap<>();
    private final String value;

    static {
        for (ArithmeticOperatorEnum e : values()) {
            label.put(e.value, e);
        }
    }

    ArithmeticOperatorEnum(String value) {
        this.value = value;
    }

    public static ArithmeticOperatorEnum valueOfLabel(String value) {
        return label.get(value);
    }

    @Override
    public String toString() {
        return value;
    }
}
