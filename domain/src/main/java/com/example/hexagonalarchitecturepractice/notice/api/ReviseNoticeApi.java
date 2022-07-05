package com.example.hexagonalarchitecturepractice.notice.api;

import com.example.hexagonalarchitecturepractice.notice.api.dto.request.NoticeDomainRequest;

import java.util.UUID;

public interface ReviseNoticeApi {

    void reviseNoticeApi(UUID noticeId, NoticeDomainRequest request);
}
