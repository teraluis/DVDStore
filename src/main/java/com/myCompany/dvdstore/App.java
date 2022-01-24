package com.myCompany.dvdstore;

import com.myCompany.dvdstore.entity.Movie;
import com.myCompany.dvdstore.service.MovieService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        String genre = getWord("Genre du film");
        String title = getWord("Titre du film");

        Movie movie = new Movie();

        movie.setGenre(genre);
        movie.setTitle(title);

        MovieService movieService = new MovieService();

        movieService.registerMovie(movie);
    }

    public static String getWord(String ask) {
        System.out.println( ask + "?" );
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();

        return answer;
    }
}
