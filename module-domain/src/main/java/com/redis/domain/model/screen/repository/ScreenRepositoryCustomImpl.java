package com.redis.domain.model.screen.repository;


import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.redis.domain.model.movie.entity.QMovieInfo;
import com.redis.domain.model.screen.entity.QScreen;
import com.redis.domain.model.screen.entity.Screen;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
public class ScreenRepositoryCustomImpl implements ScreenRepositoryCustom{

    private final JPAQueryFactory queryFactory;


    @Override
    public List<Screen> findBymovieNmNow(String movieNm) {

        BooleanBuilder builder = new BooleanBuilder();//여러 조건을 동적으로 만들 때 사용
        QMovieInfo movieInfo = QMovieInfo.movieInfo;
        QScreen screen = QScreen.screen;

        //동적이 아닐때
//        return queryFactory
//                .selectFrom(screen)
//                .join(QMovieInfo.movieInfo, movieInfo)
//                .where(
//                        movieInfo.movieNm.eq(movieNm)
//                        ,    screen.movieStartTime.after(LocalDateTime.now())
//                )
//                .orderBy(screen.movieStartTime.asc())
//                .fetch();
        

        /* 동적 작업 */
        //영화 이름이 null이 아닐 때
        if (movieNm != null) {
            builder.and(movieInfo.movieNm.eq(movieNm));
        }

        //현재 시간 이후로 시작하는 영화만 조회
        builder.and(screen.movieStartTime.after(LocalDateTime.now()));

        return queryFactory
                .selectFrom(screen)
                .where(builder)
                .fetch();
    }
}
