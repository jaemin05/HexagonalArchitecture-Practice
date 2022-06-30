package com.example.hexagonalarchitecturepractice.notice.api.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CreateNoticeDomainRequest {

    private String title;
    private String content;
}
