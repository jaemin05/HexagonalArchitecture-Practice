package com.example.hexagonalarchitecturepractice.domain.notice.spi;

import com.example.hexagonalarchitecturepractice.domain.notice.domain.repository.NoticeRepository;
import com.example.hexagonalarchitecturepractice.domain.notice.mapper.NoticeMapper;
import com.example.hexagonalarchitecturepractice.notice.Notice;
import com.example.hexagonalarchitecturepractice.notice.spi.CreateNoticeSpi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Repository
public class CreateNoticeSpiImpl implements CreateNoticeSpi {

    private final NoticeRepository noticeRepository;
    private final NoticeMapper noticeMapper;

    @Override
    @Transactional
    public void createNotice(Notice notice) {
        noticeRepository.save(noticeMapper.noticeDomainToEntity(notice));
    }
}
