package com.myCompany.dvdstore.service;

import com.myCompany.dvdstore.entity.Movie;
import com.myCompany.dvdstore.repository.MovieRepository;

public class MovieService {

    public MovieRepository movieRepository;

    public void registerMovie(Movie movie) {
        movieRepository = new MovieRepository();
        movieRepository.add(movie);
    }

}
