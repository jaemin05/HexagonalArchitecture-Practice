package com.example.hexagonalarchitecturepractice.global.error.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.util.Map;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public record BindExceptionResponse(HttpStatus status, Map<String, String> messages) {
}
