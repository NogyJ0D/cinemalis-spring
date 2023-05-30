package com.giarravalentin.cinemalis.service;

import com.giarravalentin.cinemalis.persistence.entities.Movie;
import com.giarravalentin.cinemalis.persistence.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public List<Movie> getAllMovies() {return movieRepository.findAll();}
    public void createMovie(Movie movie) {movieRepository.save(movie);}
}
