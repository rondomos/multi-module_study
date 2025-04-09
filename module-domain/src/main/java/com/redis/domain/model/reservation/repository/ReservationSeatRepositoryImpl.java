package com.redis.domain.model.reservation.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ReservationSeatRepositoryImpl implements ReservationSeatRepositoryCustom{

    private final JPAQueryFactory queryFactory;



}
