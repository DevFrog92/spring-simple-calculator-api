package com.example.calc.domain.calculator.exception;

import lombok.Getter;
import org.springframework.validation.BindingResult;

@Getter
public class CalcApiControllerException extends RuntimeException {
    private BindingResult result;

    public CalcApiControllerException() {
    }

    public CalcApiControllerException(String message) {
        super(message);
    }

    public CalcApiControllerException(String message, BindingResult bindingResult) {
        super(message);
        this.result = bindingResult;
    }

    public CalcApiControllerException(String message, Throwable cause) {
        super(message, cause);
    }

    public CalcApiControllerException(Throwable cause) {
        super(cause);
    }

    public CalcApiControllerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
