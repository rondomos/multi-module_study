package com.redis.api.movie.controller;

import com.redis.api.movie.service.MovieService;
import com.redis.common.utils.response.BaseResponse;
import com.redis.domain.model.movie.entity.Genre;
import com.redis.domain.model.movie.entity.MovieInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class MovieController {

    private final MovieService movieService;


    @GetMapping("movie/searchMovieNm")
    public BaseResponse<List<MovieInfo>> findByMovieNm(
            @RequestParam(value = "movieNm", required = false) String movieNm
    ) {
        List<MovieInfo> response = movieService.findByMovieNm(movieNm);
        return new BaseResponse<>(response);
    }

    @GetMapping("movie/searchGenre")
    public BaseResponse<List<Genre>> findByGenreCd(
            @RequestParam(value = "genre", required = false) Genre genre
    ) {
        List<Genre> response = movieService.findByGenreCd(genre);
        return new BaseResponse<>(response);
    }


}
