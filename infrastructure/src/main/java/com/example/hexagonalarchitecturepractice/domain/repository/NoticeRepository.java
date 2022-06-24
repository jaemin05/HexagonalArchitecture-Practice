package com.example.hexagonalarchitecturepractice.domain.repository;

import com.example.hexagonalarchitecturepractice.domain.NoticeEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface NoticeRepository extends CrudRepository<NoticeEntity, UUID> {
}
