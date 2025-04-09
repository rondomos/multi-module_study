package com.redis.api.movie.service;

import com.redis.domain.model.movie.entity.Genre;
import com.redis.domain.model.movie.entity.MovieInfo;
import com.redis.domain.model.movie.repository.MovieInfoRepository;
import com.redis.domain.model.movie.repository.MovieInfoRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieInfoRepository movieInfoRepository;
    private final MovieInfoRepositoryImpl movieInfoRepositoryImpl;

    //영화이름 찾기
    public List<MovieInfo> findByMovieNm(String movieNm) {
        return movieInfoRepository.findByMovieNm(movieNm);
    }
    //영화장르 찾기
    public List<Genre> findByGenreCd(Genre genreCd) {
        return movieInfoRepository.findByGenreCd(genreCd);
    }

    //QueryDSL로 영화이름, 영화이름 검색
    public List<MovieInfo> findBymovieNmAndgenreCd(String movieNm, String genreCd){
        return movieInfoRepositoryImpl.findBymovieNmAndgenreCd(movieNm,genreCd);
    }

}
