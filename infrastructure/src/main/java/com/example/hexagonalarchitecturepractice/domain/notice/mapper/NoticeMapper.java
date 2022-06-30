package com.example.hexagonalarchitecturepractice.domain.notice.mapper;

import com.example.hexagonalarchitecturepractice.domain.notice.domain.NoticeEntity;
import com.example.hexagonalarchitecturepractice.notice.Notice;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NoticeMapper {

    NoticeEntity noticeDomainToEntity(Notice notice);
}
