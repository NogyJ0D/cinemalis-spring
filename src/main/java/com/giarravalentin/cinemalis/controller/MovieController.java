package com.giarravalentin.cinemalis.controller;

import com.giarravalentin.cinemalis.persistence.entities.Movie;
import com.giarravalentin.cinemalis.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    MovieService movieService;

    @GetMapping("/")
    public ResponseEntity<List<Movie>>getAllMovies() {return ResponseEntity.ok(movieService.getAllMovies());}

    @PostMapping("/")
    public void createMovie(@RequestBody Movie movie) {movieService.createMovie(movie);}
}
