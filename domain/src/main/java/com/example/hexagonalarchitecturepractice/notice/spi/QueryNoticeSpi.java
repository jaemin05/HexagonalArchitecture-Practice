package com.example.hexagonalarchitecturepractice.notice.spi;

import com.example.hexagonalarchitecturepractice.annotation.Spi;
import com.example.hexagonalarchitecturepractice.notice.api.dto.response.NoticeDomainResponse;

import java.util.List;

@Spi
public interface QueryNoticeSpi {

    List<NoticeDomainResponse> findAll();
}
