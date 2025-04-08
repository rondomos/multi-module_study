package com.redis.domain.model.common.entity;

import com.redis.domain.config.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "common_img")
@Getter
@Setter
public class CommonImg extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long imgSeq;

    private String imgPath;
    private String imgNm;



}
