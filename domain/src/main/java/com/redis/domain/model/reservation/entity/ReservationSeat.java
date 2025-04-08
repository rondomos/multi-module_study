package com.redis.domain.model.reservation.entity;

import com.redis.domain.config.BaseEntity;
import com.redis.domain.model.seat.entity.MovieSeat;
import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Table(name = "movie_seat")
@Getter
@Setter
public class ReservationSeat extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "reservation")
    private Reservation reservation;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "seat")
    private MovieSeat seat;
}
