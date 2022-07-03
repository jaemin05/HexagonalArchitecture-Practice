package com.example.hexagonalarchitecturepractice.domain.notice.presentation;

import com.example.hexagonalarchitecturepractice.domain.notice.presentation.dto.request.NoticeRequest;
import com.example.hexagonalarchitecturepractice.domain.notice.presentation.dto.response.NoticeListResponse;
import com.example.hexagonalarchitecturepractice.notice.api.CreateNoticeApi;
import com.example.hexagonalarchitecturepractice.notice.api.QueryNoticeApi;
import com.example.hexagonalarchitecturepractice.notice.api.ReviseNoticeApi;
import com.example.hexagonalarchitecturepractice.notice.api.dto.request.NoticeDomainRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RequiredArgsConstructor
@RequestMapping("/notice")
@RestController
public class NoticeController {

    private final CreateNoticeApi createNoticeApi;
    private final ReviseNoticeApi reviseNoticeApi;
    private final QueryNoticeApi queryNoticeApi;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createNotice(@RequestBody @Valid NoticeRequest request) {

        NoticeDomainRequest domainRequest = builderToDomainRequest(request);
        createNoticeApi.createNotice(domainRequest);
    }

    @PutMapping("/{notice-uuid}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void reviseNotice(@PathVariable("notice-uuid") UUID noticeId, @RequestBody @Valid NoticeRequest request) {

        NoticeDomainRequest domainRequest = builderToDomainRequest(request);
        reviseNoticeApi.reviseNotice(noticeId, domainRequest);
    }

    @GetMapping
    public NoticeListResponse queryNoticeList() {
        return new NoticeListResponse(queryNoticeApi.queryNotice());
    }

    private NoticeDomainRequest builderToDomainRequest(NoticeRequest request) {
        return NoticeDomainRequest.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .build();
    }
}
