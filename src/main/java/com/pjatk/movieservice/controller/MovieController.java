package com.pjatk.movieservice.controller;

import com.pjatk.movieservice.model.Movie;
import com.pjatk.movieservice.service.MovieServiceService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/movies")
public class MovieController {

    private final MovieServiceService movieServiceService;

    public MovieController(MovieServiceService movieServiceService) {
        this.movieServiceService = movieServiceService;
    }

    @GetMapping
    public ResponseEntity<List<Movie>> readAllMovies() {
        return ResponseEntity.ok(movieServiceService.readAll());
    }

    @GetMapping("/{id}")
    ResponseEntity<Movie> readMovie (@PathVariable int id) {
        return ResponseEntity.ok(movieServiceService.readById(id));
    }

    @PostMapping
    ResponseEntity<Movie> createMovie (@RequestBody Movie movie) {
        return ResponseEntity.ok(movieServiceService.createMovie(movie));
    }

    @PutMapping("/{id}")
    ResponseEntity<Movie> updateMovie (@PathVariable int id, @RequestBody Movie movie) {

    }

}
