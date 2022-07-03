package com.example.hexagonalarchitecturepractice.notice.api.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Builder
public class NoticeDomainResponse {

    private final UUID noticeId;
    private final String title;
    private final String content;
    private final LocalDateTime createTime;
}
