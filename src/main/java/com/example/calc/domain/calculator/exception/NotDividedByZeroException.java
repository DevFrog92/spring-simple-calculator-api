package com.example.calc.domain.calculator.exception;

public class NotDividedByZeroException extends RuntimeException{
    public NotDividedByZeroException() {
    }

    public NotDividedByZeroException(String message) {
        super(message);
    }

    public NotDividedByZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotDividedByZeroException(Throwable cause) {
        super(cause);
    }

    public NotDividedByZeroException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
