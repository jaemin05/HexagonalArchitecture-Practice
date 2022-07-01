package com.example.hexagonalarchitecturepractice.notice.api;

import com.example.hexagonalarchitecturepractice.notice.api.dto.NoticeDomainRequest;

public interface CreateNoticeApi {

    void createNotice(NoticeDomainRequest request);
}
