package com.redis.domain.model.seat.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MovieSeatRepositoryCustomImpl implements  MovieSeatRepositoryCustom {
    private final JPAQueryFactory queryFactory;
}
