package com.example.hexagonalarchitecturepractice.notice.api;

import com.example.hexagonalarchitecturepractice.notice.api.dto.request.NoticeDomainRequest;

public interface CreateNoticeApi {

    void createNotice(NoticeDomainRequest request);
}
