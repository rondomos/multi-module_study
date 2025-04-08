package com.redis.domain.model.reservation.repository;


import com.redis.domain.model.reservation.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
