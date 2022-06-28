package com.example.hexagonalarchitecturepractice.global.error.exception;

import com.example.hexagonalarchitecturepractice.global.error.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CustomException extends RuntimeException {

    private final ErrorCode errorCode;
}
