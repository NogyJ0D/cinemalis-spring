package com.giarravalentin.cinemalis.persistence.repository;

import com.giarravalentin.cinemalis.persistence.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    @Query(value = "SELECT * FROM MOVIES WHERE RATING = (SELECT MAX(RATING) FROM MOVIES)", nativeQuery = true)
    Movie findMaxRating();
}
