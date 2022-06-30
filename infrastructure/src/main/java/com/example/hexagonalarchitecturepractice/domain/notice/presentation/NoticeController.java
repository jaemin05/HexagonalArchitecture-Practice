package com.example.hexagonalarchitecturepractice.domain.notice.presentation;

import com.example.hexagonalarchitecturepractice.domain.notice.presentation.dto.CreateNoticeRequest;
import com.example.hexagonalarchitecturepractice.notice.api.CreateNoticeApi;
import com.example.hexagonalarchitecturepractice.notice.api.dto.CreateNoticeDomainRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/notice")
public class NoticeController {

    private final CreateNoticeApi createNoticeApi;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createNotice(@RequestBody @Valid CreateNoticeRequest request) {
        CreateNoticeDomainRequest domainRequest = CreateNoticeDomainRequest.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .build();

        createNoticeApi.createNotice(domainRequest);
    }
}
