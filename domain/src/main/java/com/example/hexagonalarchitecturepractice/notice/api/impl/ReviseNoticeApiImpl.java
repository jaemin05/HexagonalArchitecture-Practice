package com.example.hexagonalarchitecturepractice.notice.api.impl;

import com.example.hexagonalarchitecturepractice.annotation.DomainService;
import com.example.hexagonalarchitecturepractice.notice.Notice;
import com.example.hexagonalarchitecturepractice.notice.api.ReviseNoticeApi;
import com.example.hexagonalarchitecturepractice.notice.api.dto.NoticeDomainRequest;
import com.example.hexagonalarchitecturepractice.notice.exception.NoticeNotFoundException;
import com.example.hexagonalarchitecturepractice.notice.spi.NoticeRepositorySpi;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
@DomainService
public class ReviseNoticeApiImpl implements ReviseNoticeApi {

    private final NoticeRepositorySpi noticeRepositorySpi;

    @Override
    public void reviseNotice(UUID noticeId, NoticeDomainRequest request) {

        if (!noticeRepositorySpi.isNoticeExists(noticeId)) {
            throw NoticeNotFoundException.EXCEPTION;
        }

        Notice.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .build();
    }
}
