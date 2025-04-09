package com.redis.domain.model.screen.repository;


import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ScreenRepositoryCustomImpl implements ScreenRepositoryCustom{

    private final JPAQueryFactory queryFactory;


}
