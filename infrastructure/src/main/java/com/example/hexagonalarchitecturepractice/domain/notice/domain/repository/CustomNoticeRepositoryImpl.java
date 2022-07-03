package com.example.hexagonalarchitecturepractice.domain.notice.domain.repository;

import com.example.hexagonalarchitecturepractice.domain.notice.domain.repository.vo.NoticeVO;
import com.example.hexagonalarchitecturepractice.domain.notice.domain.repository.vo.QNoticeVO;
import com.example.hexagonalarchitecturepractice.notice.api.dto.response.NoticeDomainResponse;
import com.example.hexagonalarchitecturepractice.notice.spi.QueryNoticeSpi;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

import static com.example.hexagonalarchitecturepractice.domain.notice.domain.QNoticeEntity.noticeEntity;

@RequiredArgsConstructor
@Repository
public class CustomNoticeRepositoryImpl implements QueryNoticeSpi {

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<NoticeDomainResponse> findAll() {
        List<NoticeVO> noticeListResponse = jpaQueryFactory
                .select(
                        new QNoticeVO(
                                noticeEntity.id,
                                noticeEntity.title,
                                noticeEntity.content,
                                noticeEntity.createTime
                        ))
                .from(noticeEntity)
                .fetch();

        return noticeListResponse
                .stream()
                .map(
                        noticeResponse ->
                                NoticeDomainResponse.builder()
                                        .noticeId(noticeResponse.getNoticeId())
                                        .title(noticeResponse.getTitle())
                                        .content(noticeResponse.getContent())
                                        .createTime(noticeResponse.getCreateTime())
                                        .build())
                .collect(Collectors.toList());
    }
}
