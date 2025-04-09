package com.redis.domain.model.screen.repository;

import com.redis.domain.model.reservation.entity.Reservation;
import com.redis.domain.model.screen.entity.Screen;
import com.redis.domain.model.seat.entity.MovieSeat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScreenRepositoryCustom {

    //사용자가 선택한 영화의 상영가능 영화 리스트 보기
    List<Screen> findBymovieNmNow(String movieNm);

    //선택한 영화의 예약 가능한 좌석 보여주기(예매가능여부)






}
