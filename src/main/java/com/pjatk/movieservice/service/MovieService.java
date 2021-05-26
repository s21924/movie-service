package com.pjatk.movieservice.service;

import com.pjatk.movieservice.model.Movie;
import com.pjatk.movieservice.model.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {


    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    public Optional<Movie> findById (Long id) {
        return movieRepository.findById(id);
    }

    public Movie addMovie (Movie movie) {
        return movieRepository.save(movie);
    }

    public List<Movie> findAllMovies () {
        return movieRepository.findAll();
    }

    public void deleteById (Long id) {
        if (movieRepository.existsById(id)) {
            movieRepository.deleteById(id);
        }
    }

    public void updateById (Long id, Movie movie) {
        if (movieRepository.existsById(id)) {
            movieRepository.deleteById(id);
            movieRepository.save(movie).setId(id);

        }
    }

}
