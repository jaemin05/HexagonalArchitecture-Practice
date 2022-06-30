package com.example.hexagonalarchitecturepractice.notice.spi;

import com.example.hexagonalarchitecturepractice.annotation.Spi;
import com.example.hexagonalarchitecturepractice.notice.Notice;

@Spi
public interface NoticeRepositorySpi {
    void createNotice(Notice notice);
}
