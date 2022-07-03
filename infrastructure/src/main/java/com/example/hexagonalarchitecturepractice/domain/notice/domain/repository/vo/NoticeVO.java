package com.example.hexagonalarchitecturepractice.domain.notice.domain.repository.vo;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class NoticeVO {

    private final UUID noticeId;
    private final String title;
    private final String content;
    private final LocalDateTime createTime;

    @QueryProjection
    public NoticeVO(UUID noticeId, String title, String content, LocalDateTime createTime) {
        this.noticeId = noticeId;
        this.title = title;
        this.content = content;
        this.createTime = createTime;
    }
}
