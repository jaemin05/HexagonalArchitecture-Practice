package com.example.hexagonalarchitecturepractice.notice.spi;

import com.example.hexagonalarchitecturepractice.notice.api.dto.response.NoticeDomainResponse;

import java.util.List;

public interface QueryNoticeSpi {

    List<NoticeDomainResponse> findAll();
}
