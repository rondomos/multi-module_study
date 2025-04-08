package com.redis.domain.model.movie.repository;

import com.redis.domain.model.movie.entity.Genre;
import com.redis.domain.model.movie.entity.Grade;
import com.redis.domain.model.movie.entity.MovieInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


//extends JpaRepository<Map, Long> 처럼 map으로도 받을 수 있음
public interface MovieInfoRepository extends JpaRepository<MovieInfo,Long>,MovieInfoRepositoryCustom {
    //영화이름 찾기
    List<MovieInfo> findByMovieNm(String movieNm);
    //영화장르 찾기
    List<Genre> findByGenreCd(Genre genreCd);

}
