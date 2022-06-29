package com.example.hexagonalarchitecturepractice.domain;

import com.example.hexagonalarchitecturepractice.global.entity.BaseEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Table(name = "tbl_notice")
@Entity
public class NoticeEntity extends BaseEntity {

    @Column(length = 50, nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;
}
