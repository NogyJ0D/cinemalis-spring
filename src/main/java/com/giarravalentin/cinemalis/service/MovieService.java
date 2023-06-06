package com.giarravalentin.cinemalis.service;

import com.giarravalentin.cinemalis.persistence.entities.Movie;
import com.giarravalentin.cinemalis.persistence.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public List<Movie> getAllMovies() {return movieRepository.findAll();}
    public void createMovie(Movie movie) {movieRepository.save(movie);}
    public Optional<Movie> findById(Long id) {return movieRepository.findById(id);}
    public Movie findMaxRating(){return movieRepository.findMaxRating();}
}
