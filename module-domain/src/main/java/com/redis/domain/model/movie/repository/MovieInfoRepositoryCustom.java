package com.redis.domain.model.movie.repository;

import java.util.List;
import com.redis.domain.model.movie.entity.MovieInfo;

/*
** JpaRepository가 기존에 있을 때 같이 사용하기 위한 방법
* 동적 쿼리 만들기
* 1. ~~~RepositoryCustom 을 만든다
* 2. MovieInfoRepository(인터페이스) 에  JpaRepository,MovieInfoRepositoryCustom extends 한다
* 3. MovieInfoRepositoryImpl(java) 을 생성해 MovieInfoRepositoryCustom implements 한다
* */
public interface MovieInfoRepositoryCustom {
    //영화이름 찾기
    List<MovieInfo> findByMovieNm(String movieNm);
    //영화장르 찾기
    List<MovieInfo> findByGenreCd(String genreCd);
    //영화이름과 영화장르 파라미터 두개
    List<MovieInfo> findBymovieNmAndgenreCd(String movieNm,String genreCd);


}
