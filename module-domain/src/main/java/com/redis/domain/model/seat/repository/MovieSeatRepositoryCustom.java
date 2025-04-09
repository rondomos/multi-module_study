package com.redis.domain.model.seat.repository;

import com.redis.domain.model.seat.entity.MovieSeat;

import java.util.List;
import java.util.Map;

public interface MovieSeatRepositoryCustom {

    //선택한 영화의 예약 가능한 좌석 보여주기(예매가능여부)
   List<MovieSeat> findAllLeftMovieSeat(int movieId, int cinemaId);

}
