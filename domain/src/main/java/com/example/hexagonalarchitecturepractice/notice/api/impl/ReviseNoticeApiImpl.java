package com.example.hexagonalarchitecturepractice.notice.api.impl;

import com.example.hexagonalarchitecturepractice.annotation.DomainService;
import com.example.hexagonalarchitecturepractice.notice.api.ReviseNoticeApi;
import com.example.hexagonalarchitecturepractice.notice.api.dto.request.NoticeDomainRequest;
import com.example.hexagonalarchitecturepractice.notice.spi.ReviseNoticeSpi;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
@DomainService
public class ReviseNoticeApiImpl implements ReviseNoticeApi {

    private final ReviseNoticeSpi reviseNoticeSpi;

    @Override
    public void reviseNoticeApi(UUID noticeId, NoticeDomainRequest request) {



        reviseNoticeSpi.reviseNotice(noticeId, request);
    }
}
