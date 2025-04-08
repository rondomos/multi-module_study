package com.redis.domain.model.user.repository;


import com.redis.domain.model.user.entity.MovieUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieUserRepository extends JpaRepository<MovieUser,Long> {
}
