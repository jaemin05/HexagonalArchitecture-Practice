package com.example.hexagonalarchitecturepractice.domain.notice.spi;

import com.example.hexagonalarchitecturepractice.domain.notice.domain.NoticeEntity;
import com.example.hexagonalarchitecturepractice.domain.notice.domain.repository.NoticeRepository;
import com.example.hexagonalarchitecturepractice.notice.api.dto.request.NoticeDomainRequest;
import com.example.hexagonalarchitecturepractice.notice.exception.NoticeNotFoundException;
import com.example.hexagonalarchitecturepractice.notice.spi.ReviseNoticeSpi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@RequiredArgsConstructor
@Repository
public class ReviseNoticeSpiImpl implements ReviseNoticeSpi {

    private final NoticeRepository noticeRepository;

    @Override
    @Transactional
    public void reviseNotice(UUID noticeId, NoticeDomainRequest request) {

        NoticeEntity notice = noticeRepository.findById(noticeId)
                .orElseThrow(() -> NoticeNotFoundException.EXCEPTION);

        notice.reviseNotice(request.getTitle(), request.getContent());
    }
}
