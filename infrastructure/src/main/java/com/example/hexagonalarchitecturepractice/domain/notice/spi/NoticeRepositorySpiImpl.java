package com.example.hexagonalarchitecturepractice.domain.notice.spi;

import com.example.hexagonalarchitecturepractice.domain.notice.mapper.NoticeMapper;
import com.example.hexagonalarchitecturepractice.domain.notice.domain.repository.NoticeRepository;
import com.example.hexagonalarchitecturepractice.notice.Notice;
import com.example.hexagonalarchitecturepractice.notice.spi.NoticeRepositorySpi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class NoticeRepositorySpiImpl implements NoticeRepositorySpi {

    private final NoticeRepository noticeRepository;
    private final NoticeMapper noticeMapper;

    @Override
    public void createNotice(Notice notice) {
        noticeRepository.save(noticeMapper.noticeDomainToEntity(notice));
    }
}
