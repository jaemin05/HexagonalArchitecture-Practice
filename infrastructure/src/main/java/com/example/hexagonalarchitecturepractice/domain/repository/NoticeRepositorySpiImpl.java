package com.example.hexagonalarchitecturepractice.domain.repository;

import com.example.hexagonalarchitecturepractice.notice.spi.NoticeRepositorySpi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class NoticeRepositorySpiImpl implements NoticeRepositorySpi {

    private final NoticeRepository noticeRepository;
}
