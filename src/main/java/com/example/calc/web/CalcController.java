package com.example.calc.web;

import com.example.calc.domain.calculator.dto.CalcDto;
import com.example.calc.domain.calculator.dto.RequestDto;
import com.example.calc.domain.calculator.dto.ResponseDto;
import com.example.calc.domain.calculator.exception.CalcApiControllerException;
import com.example.calc.domain.calculator.service.CalcService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calc")
@Slf4j
@RequiredArgsConstructor
public class CalcController {
    private final CalcService service;

    @PostMapping
    public ResponseEntity<ResponseDto> hello(
            @RequestBody @Validated RequestDto requestDto,
            BindingResult bindingResult) {

        if(bindingResult.hasErrors()) {
            throw new CalcApiControllerException("잘못된 요청입니다.", bindingResult);
        }

        CalcDto calcResult = service.calculator(requestDto);

        return ResponseEntity.ok().body(ResponseDto
                .builder()
                        .statusCode(HttpStatus.OK.value())
                        .message("성공적으로 계산되었습니다.")
                        .body(calcResult)
                .build());
    }
}
