package com.redis.domain.model.seat.entity;

import com.redis.domain.model.screen.entity.Screen;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "movie_seat")
@Getter
@Setter
public class MovieSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seatId; //좌석Id

    private Long cinemaId;
    private String seatCd; //좌석코드
    private String seatNm; //좌석이름
    private String seatLv;
    private Boolean isReserved;

    private String seatCol; //좌석 위치 열
    private String seatRow; //좌석 위치 행

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "screen")
    private Screen screen;


    public void updateReserved() {
        this.isReserved = true;
    }
}
