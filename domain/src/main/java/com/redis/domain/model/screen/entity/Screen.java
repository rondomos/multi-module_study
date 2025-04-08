package com.redis.domain.model.screen.entity;

import com.redis.domain.config.BaseEntity;
import com.redis.domain.model.movie.entity.MovieInfo;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "cinema_movie_time")
@Getter
@Setter
public class Screen extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cinemaId;

    private Long movieId;
    private Integer movieRound; //영화회차
    private LocalDateTime movieStartTime; // 영화시작시간
    private LocalDateTime movieEndTime; // 영화종료시간
    private Integer movieHall; //영화상영관
    private String cinemaNm; //영화관이름
    private Boolean screenShowYn; //영화관시간표보임여부
    private LocalDateTime createDate; //생성일
    private LocalDateTime modifyDate; //수정일


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movieInfo")
    private MovieInfo movieInfo;

}
