package com.redis.domain.model.reservation.repository;

import com.redis.domain.model.reservation.entity.ReservationSeat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationSeatRepository extends JpaRepository<ReservationSeat,Long> {}
