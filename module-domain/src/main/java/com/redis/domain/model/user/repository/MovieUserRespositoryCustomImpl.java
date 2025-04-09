package com.redis.domain.model.user.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class MovieUserRespositoryCustomImpl implements MovieUserRepositoryCustom{
    private final JPAQueryFactory queryFactory;
}
