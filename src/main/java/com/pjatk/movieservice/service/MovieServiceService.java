package com.pjatk.movieservice.service;

import com.pjatk.movieservice.model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceService {

    private List<Movie> movieRepository;

    public MovieServiceService(ArrayList<Movie> movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void addMovie (Movie movie) {
        movieRepository.add(movie);
    }

    public List<Movie> readAll() {
        return movieRepository;
    }

    public Movie readById(int id) {
        return movieRepository.get(id);
    }

    public Movie  createMovie (Movie movie) {
        movieRepository.add(movie);
        return movie;
    }

}
