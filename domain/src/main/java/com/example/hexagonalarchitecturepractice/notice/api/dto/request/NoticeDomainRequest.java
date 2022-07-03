package com.example.hexagonalarchitecturepractice.notice.api.dto.request;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class NoticeDomainRequest {

    private String title;
    private String content;
}
