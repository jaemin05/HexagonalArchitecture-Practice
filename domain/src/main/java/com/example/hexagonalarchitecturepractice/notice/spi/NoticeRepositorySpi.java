package com.example.hexagonalarchitecturepractice.notice.spi;

import com.example.hexagonalarchitecturepractice.annotation.Spi;

import java.util.UUID;

@Spi
public interface NoticeRepositorySpi {

    boolean isNoticeExists(UUID noticeId);
}
