package com.example.hexagonalarchitecturepractice.domain.notice.presentation.dto.response;

import com.example.hexagonalarchitecturepractice.notice.api.dto.response.NoticeDomainResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class NoticeListResponse {

    private final List<NoticeDomainResponse> noticeDomainResponseList;
}
