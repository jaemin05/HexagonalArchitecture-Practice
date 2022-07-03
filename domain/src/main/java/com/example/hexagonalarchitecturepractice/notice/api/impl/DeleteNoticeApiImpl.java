package com.example.hexagonalarchitecturepractice.notice.api.impl;

import com.example.hexagonalarchitecturepractice.annotation.DomainService;
import com.example.hexagonalarchitecturepractice.notice.api.DeleteNoticeApi;
import com.example.hexagonalarchitecturepractice.notice.spi.DeleteNoticeSpi;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
@DomainService
public class DeleteNoticeApiImpl implements DeleteNoticeApi {

    private final DeleteNoticeSpi deleteNoticeSpi;

    @Override
    public void deleteNotice(UUID noticeId) {
        deleteNoticeSpi.deleteNotice(noticeId);
    }
}
