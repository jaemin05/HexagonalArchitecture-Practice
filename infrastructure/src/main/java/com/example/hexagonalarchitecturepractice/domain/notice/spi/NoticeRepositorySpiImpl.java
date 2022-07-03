package com.example.hexagonalarchitecturepractice.domain.notice.spi;

import com.example.hexagonalarchitecturepractice.domain.notice.domain.repository.NoticeRepository;
import com.example.hexagonalarchitecturepractice.notice.exception.NoticeNotFoundException;
import com.example.hexagonalarchitecturepractice.notice.spi.NoticeRepositorySpi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@RequiredArgsConstructor
@Repository
public class NoticeRepositorySpiImpl implements NoticeRepositorySpi {

    private final NoticeRepository noticeRepository;

    @Override
    public void getNoticeExistence(UUID noticeId) {
        noticeRepository.findById(noticeId)
                .orElseThrow(() -> NoticeNotFoundException.EXCEPTION);
    }
}
