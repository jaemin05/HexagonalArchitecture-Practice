package com.example.hexagonalarchitecturepractice.global.error.exception;

import lombok.Builder;
import org.springframework.http.HttpStatus;

import java.util.Map;

@Builder
public record BindExceptionResponse(HttpStatus status, Map<String, String> messages) {
}
