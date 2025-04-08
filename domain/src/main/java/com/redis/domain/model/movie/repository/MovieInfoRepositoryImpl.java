package com.redis.domain.model.movie.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.redis.domain.model.movie.entity.Genre;
import com.redis.domain.model.movie.entity.MovieInfo;
import lombok.RequiredArgsConstructor;
import com.querydsl.core.types.dsl.BooleanExpression;
import java.util.List;


@RequiredArgsConstructor // queryFactory를 생성자에 포함
public class MovieInfoRepositoryImpl implements MovieInfoRepositoryCustom {

    private final JPAQueryFactory queryFactory;




    @Override
    public List<MovieInfo> findByMovieNm(String movieNm) {
        return List.of();
    }

    @Override
    public List<Genre> findByGenreCd(Genre genreCd) {
        return List.of();
    }
}
