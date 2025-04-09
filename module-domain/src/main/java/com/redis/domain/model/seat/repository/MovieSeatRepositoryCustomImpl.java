package com.redis.domain.model.seat.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.redis.domain.model.movie.entity.QMovieInfo;
import com.redis.domain.model.seat.entity.MovieSeat;
import com.redis.domain.model.seat.entity.QMovieSeat;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class MovieSeatRepositoryCustomImpl implements  MovieSeatRepositoryCustom {
    private final JPAQueryFactory queryFactory;

    //선택한 영화의 예약 가능한 좌석 보여주기(예매가능여부)
    @Override
    public List<MovieSeat> findAllLeftMovieSeat(int movieId, int cinemaId) {
        QMovieSeat movieSeat= QMovieSeat.movieSeat;
        return queryFactory
                .selectFrom(movieSeat)
                .where(QMovieSeat.movieSeat.isReserved.eq(false))
                .fetch();
    }

}
