package com.example.hexagonalarchitecturepractice.global.error.exception;

import com.example.hexagonalarchitecturepractice.global.error.ErrorCode;
import com.example.hexagonalarchitecturepractice.global.error.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ErrorResponse> handleCustomException(CustomException e) {

        ErrorCode errorCode = e.getErrorCode();
        ErrorResponse errorResponse = new ErrorResponse(errorCode);

        return new ResponseEntity<>(errorResponse, HttpStatus.valueOf(errorCode.getStatus()));
    }

    @ExceptionHandler(BindException.class)
    public ResponseEntity<BindExceptionResponse> bindExceptionHandler(BindException e) {

        Map<String, String> errorMap = new HashMap<>();

        for (FieldError fieldError : e.getFieldErrors()) {
            errorMap.put(fieldError.getField(), fieldError.getDefaultMessage());
        }

        BindExceptionResponse bindExceptionResponse = BindExceptionResponse.builder()
                .status(HttpStatus.BAD_REQUEST)
                .messages(errorMap)
                .build();

        return new ResponseEntity<>(bindExceptionResponse, HttpStatus.BAD_REQUEST);
    }
}
