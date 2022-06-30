package com.example.hexagonalarchitecturepractice.notice.api.impl;

import com.example.hexagonalarchitecturepractice.annotation.DomainService;
import com.example.hexagonalarchitecturepractice.notice.Notice;
import com.example.hexagonalarchitecturepractice.notice.api.CreateNoticeApi;
import com.example.hexagonalarchitecturepractice.notice.api.dto.CreateNoticeDomainRequest;
import com.example.hexagonalarchitecturepractice.notice.spi.NoticeRepositorySpi;
import lombok.RequiredArgsConstructor;

@DomainService
@RequiredArgsConstructor
public class CreateNoticeApiImpl implements CreateNoticeApi {

    private final NoticeRepositorySpi noticeRepositorySpi;

    @Override
    public void createNotice(CreateNoticeDomainRequest request) {

        Notice notice = Notice.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .build();

        noticeRepositorySpi.createNotice(notice);
    }
}
