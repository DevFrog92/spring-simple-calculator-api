package com.example.calc.domain.calculator.handler;

import com.example.calc.domain.calculator.dto.ResponseDto;
import com.example.calc.domain.calculator.exception.CalcApiControllerException;
import com.example.calc.domain.calculator.exception.NotDividedByZeroException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
@Slf4j
public class CustomExceptionHandler {

    @ExceptionHandler(CalcApiControllerException.class)
    public ResponseEntity<ResponseDto> calcApiException(
            CalcApiControllerException e) {

        BindingResult result = e.getResult();
        Map<String, String> errMap = new HashMap<>();
        for (FieldError fieldError: result.getFieldErrors()) {
            errMap.put(fieldError.getField(), fieldError.getDefaultMessage());
        }

        return new ResponseEntity<>(
                new ResponseDto(
                        HttpStatus.BAD_REQUEST.value(),
                        e.getMessage(),
                        errMap
                ),
                HttpStatus.BAD_REQUEST
        );
    }

    @ExceptionHandler(NotDividedByZeroException.class)
    public ResponseEntity<ResponseDto> notDividedByZero(
            NotDividedByZeroException e
    ) {
        Map<String, String> errMap = new HashMap<>();
        errMap.put("operand2", "0으로 나눌 수 없습니다.");

        return new ResponseEntity<>(
                new ResponseDto(
                        HttpStatus.BAD_REQUEST.value(),
                        e.getMessage(),
                        errMap
                ),
                HttpStatus.BAD_REQUEST
        );
    }
}
