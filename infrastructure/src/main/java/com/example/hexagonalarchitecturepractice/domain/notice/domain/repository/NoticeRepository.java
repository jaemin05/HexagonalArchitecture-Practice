package com.example.hexagonalarchitecturepractice.domain.notice.domain.repository;

import com.example.hexagonalarchitecturepractice.domain.notice.domain.NoticeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface NoticeRepository extends CrudRepository<NoticeEntity, UUID> {
}
