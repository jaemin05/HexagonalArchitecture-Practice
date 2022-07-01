package com.example.hexagonalarchitecturepractice.notice.api.impl;

import com.example.hexagonalarchitecturepractice.annotation.DomainService;
import com.example.hexagonalarchitecturepractice.notice.Notice;
import com.example.hexagonalarchitecturepractice.notice.api.CreateNoticeApi;
import com.example.hexagonalarchitecturepractice.notice.api.dto.NoticeDomainRequest;
import com.example.hexagonalarchitecturepractice.notice.spi.CreateNoticeSpi;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@DomainService
public class CreateNoticeApiImpl implements CreateNoticeApi {

    private final CreateNoticeSpi createNoticeSpi;

    @Override
    public void createNotice(NoticeDomainRequest request) {

        Notice notice = Notice.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .build();

        createNoticeSpi.createNotice(notice);
    }
}
