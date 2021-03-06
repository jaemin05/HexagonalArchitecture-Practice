package com.example.hexagonalarchitecturepractice.global.error;

import com.example.hexagonalarchitecturepractice.error.ErrorCode;
import lombok.Getter;

@Getter
public class ErrorResponse {

    public ErrorResponse(ErrorCode errorCode) {
        this.status = errorCode.getStatus();
        this.message = errorCode.getMessage();
    }

    private final int status;
    private final String message;
}
