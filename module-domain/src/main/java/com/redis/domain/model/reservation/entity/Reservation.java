package com.redis.domain.model.reservation.entity;

import com.redis.domain.config.BaseEntity;
import com.redis.domain.model.screen.entity.Screen;
import com.redis.domain.model.user.entity.MovieUser;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;


@Entity
@Table(name = "movie_reser")
@Getter
@Setter
public class Reservation extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reserId;

    private String seatId;
    private String userId;
    private String reserCd;
    private String loginId;

    @CreatedDate
    private LocalDateTime reserTime;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movieUser")
    private MovieUser movieUser;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "screen")
    private Screen screen;



}
