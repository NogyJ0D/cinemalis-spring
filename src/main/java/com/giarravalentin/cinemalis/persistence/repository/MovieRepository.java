package com.giarravalentin.cinemalis.persistence.repository;

import com.giarravalentin.cinemalis.persistence.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
