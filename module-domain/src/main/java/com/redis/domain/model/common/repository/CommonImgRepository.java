package com.redis.domain.model.common.repository;


import com.redis.domain.model.common.entity.CommonImg;
import com.redis.domain.model.reservation.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CommonImgRepository extends JpaRepository<CommonImg,Long> {
}
