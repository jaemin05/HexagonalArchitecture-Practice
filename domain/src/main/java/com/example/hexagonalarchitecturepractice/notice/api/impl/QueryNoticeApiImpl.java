package com.example.hexagonalarchitecturepractice.notice.api.impl;

import com.example.hexagonalarchitecturepractice.annotation.DomainService;
import com.example.hexagonalarchitecturepractice.notice.api.QueryNoticeApi;
import com.example.hexagonalarchitecturepractice.notice.api.dto.response.NoticeDomainResponse;
import com.example.hexagonalarchitecturepractice.notice.spi.QueryNoticeSpi;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@DomainService
public class QueryNoticeApiImpl implements QueryNoticeApi {

    private final QueryNoticeSpi queryNoticeSpi;

    @Override
    public List<NoticeDomainResponse> queryNotice() {

        return queryNoticeSpi.findAll();
    }
}
