package com.redis.domain.model.movie.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.redis.domain.model.movie.entity.Genre;
import com.redis.domain.model.movie.entity.MovieInfo;
import com.redis.domain.model.movie.entity.QMovieInfo;
import lombok.RequiredArgsConstructor;
import java.util.List;
import com.querydsl.core.types.dsl.BooleanExpression;

/*
===> QueryDSL을 사용한 동적쿼리 작성
컴파일 시점에서 오류를 잡을 수 있어서 안전하고 편리함
조건이 null이면 무시되어 동적 쿼리에 유리함(null허용)
*/
@RequiredArgsConstructor // queryFactory를 생성자에 포함
public class MovieInfoRepositoryImpl implements MovieInfoRepositoryCustom {


    private final JPAQueryFactory queryFactory;


    //영화이름 찾기
    @Override
    public List<MovieInfo> findByMovieNm(String movieNm) {
        QMovieInfo movieInfo = QMovieInfo.movieInfo;
        return queryFactory
                .selectFrom(movieInfo)
                .where(movieInfo.movieNm.eq(movieNm))
                .fetch();
    }

    //영화장르 찾기
    @Override
    public List<MovieInfo> findByGenreCd(String genreCd) {
        QMovieInfo movieInfo = QMovieInfo.movieInfo;
        return queryFactory
                .selectFrom(movieInfo)
                .where(movieInfo.genreCd.eq(Genre.valueOf(genreCd)))
                .fetch();
    }

    //영화이름과 영화장르 파라미터 두개
    @Override
    public List<MovieInfo> findBymovieNmAndgenreCd(String movieNm, String genreCd) {
        QMovieInfo movieInfo = QMovieInfo.movieInfo;
        return queryFactory
                .selectFrom(movieInfo)
                .where( movieNm != null ? movieInfo.movieNm.eq(movieNm) : null,
                        genreCd != null ? movieInfo.genreCd.eq(Genre.valueOf(genreCd)) : null
                )
                .fetch();
    }




}
