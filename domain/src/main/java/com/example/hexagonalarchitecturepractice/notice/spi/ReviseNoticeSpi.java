package com.example.hexagonalarchitecturepractice.notice.spi;

import com.example.hexagonalarchitecturepractice.annotation.Spi;
import com.example.hexagonalarchitecturepractice.notice.api.dto.request.NoticeDomainRequest;

import java.util.UUID;

@Spi
public interface ReviseNoticeSpi {

    void reviseNotice(UUID noticeId, NoticeDomainRequest request);
}
