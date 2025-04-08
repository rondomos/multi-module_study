package com.redis.domain.model.movie.repository;

import com.redis.domain.model.movie.entity.Genre;
import com.redis.domain.model.movie.entity.MovieInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/*
** JpaRepository가 기존에 있을 때 같이 사용하기 위한 방법
* 동적 쿼리 만들기
* 1. ~~~RepositoryCustom 을 첫번째로 만든다
* 2. MovieInfoRepository 에  JpaRepository,MovieInfoRepositoryCustom extends 한다
* 3. MovieInfoRepositoryImpl 을 생성해 MovieInfoRepositoryCustom implements 한다
* */
public interface MovieInfoRepositoryCustom {
    //영화이름 찾기
    List<MovieInfo> findByMovieNm(String movieNm);
    //영화장르 찾기
    List<Genre> findByGenreCd(Genre genreCd);

}
