package com.example.hexagonalarchitecturepractice.notice.api;

import com.example.hexagonalarchitecturepractice.notice.api.dto.CreateNoticeDomainRequest;

public interface CreateNoticeApi {
    void createNotice(CreateNoticeDomainRequest request);
}
