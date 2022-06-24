package com.example.hexagonalarchitecturepractice.notice;

import com.example.hexagonalarchitecturepractice.annotation.Aggregate;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Aggregate
@Getter
@Builder
public class NoticeEntity {

    private UUID id;

    private String title;

    private String content;

    private LocalDateTime createTime;
}
