package com.example.hexagonalarchitecturepractice.domain.notice.spi;

import com.example.hexagonalarchitecturepractice.domain.notice.domain.NoticeEntity;
import com.example.hexagonalarchitecturepractice.domain.notice.domain.repository.NoticeRepository;
import com.example.hexagonalarchitecturepractice.notice.exception.NoticeNotFoundException;
import com.example.hexagonalarchitecturepractice.notice.spi.DeleteNoticeSpi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@RequiredArgsConstructor
@Repository
public class DeleteNoticeSpiImpl implements DeleteNoticeSpi {

    private final NoticeRepository noticeRepository;

    @Override
    public void deleteNotice(UUID noticeId) {

        NoticeEntity notice = noticeRepository.findById(noticeId)
                .orElseThrow(() -> NoticeNotFoundException.EXCEPTION);

        noticeRepository.delete(notice);
    }
}
