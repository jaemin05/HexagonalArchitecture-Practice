package com.example.hexagonalarchitecturepractice.notice.api;

import com.example.hexagonalarchitecturepractice.notice.api.dto.response.NoticeDomainResponse;

import java.util.List;

public interface QueryNoticeApi {

    List<NoticeDomainResponse> queryNotice();
}
