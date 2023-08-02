package com.example.calc.domain.calculator.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EnumValidator implements ConstraintValidator<Enum, String> {
    private Enum annotation;

    @Override
    public void initialize(Enum annotation) {
         this.annotation = annotation;
    }


    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        boolean result = false;

        Object[] enumValues = this.annotation.enumClass().getEnumConstants();
        if(enumValues != null && value != null) {
            for (Object enumValue : enumValues) {
                if(value.equals(enumValue.toString()) ||
                        (this.annotation.ignoreCase() &&
                                value.equalsIgnoreCase(enumValue.toString()))){
                    result = true;
                    break;
                }
            }
        }

        return result;
    }
}
