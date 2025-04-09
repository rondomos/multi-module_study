package com.redis.domain.model.movie.entity;


import com.redis.domain.config.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "movie_info")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieInfo extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;
    @Enumerated(EnumType.STRING)
    private Genre genreCd;
    @Enumerated(EnumType.STRING)
    private Grade grade;//관람가

    private String movieNm; //영화이름
    private String subTitle; //부제목
    private String directorNm; //감독이름 
    private LocalDateTime pubDate; //제작날짜
    private String countryCd; // 나라코드
    private String castNm; // 출연진
    private String movieLink; //영화링크
    private Double movieRate; //영화평점
    private LocalDateTime  openDate; //개봉일
    private Integer showTimeMin; //상영러닝타임
    private Boolean showYn; //현재상영여부
    private LocalDateTime createDate;//생성일자
    private LocalDateTime modifyDate; // 수정일자
    private Integer thumImg;//썸네일 이미지
    private String dscription; // 영화설명

}