package com.example.hexagonalarchitecturepractice.notice.api;

import com.example.hexagonalarchitecturepractice.notice.api.dto.NoticeDomainRequest;

import java.util.UUID;

public interface ReviseNoticeApi {

    void reviseNotice(UUID noticeId, NoticeDomainRequest request);
}
