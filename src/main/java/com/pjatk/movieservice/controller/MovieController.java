package com.pjatk.movieservice.controller;

import com.pjatk.movieservice.model.Movie;
import com.pjatk.movieservice.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public ResponseEntity<List<Movie>> readAllMovies() {
        return ResponseEntity.ok(movieService.findAllMovies());
    }

    @GetMapping("/{id}")
    ResponseEntity<Optional<Movie>> readMovie (@PathVariable Long id) {
        return ResponseEntity.ok(movieService.findById(id));
    }

    @PostMapping
    ResponseEntity<Movie> createMovie (@RequestBody Movie movie) {
        return ResponseEntity.ok(movieService.addMovie(movie));
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Movie> deleteMovie (@PathVariable Long id) {
         movieService.deleteById(id);
         return ResponseEntity.noContent().build();

    }


    @PutMapping("/{id}")
    ResponseEntity<Movie> updateMovie (@PathVariable Long id, @RequestBody Movie movie) {
        movieService.updateById(id, movie);
        return ResponseEntity.noContent().build();

    }

}
