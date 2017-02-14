package com.applepluot.rottentomatoes;

import java.util.ArrayList;

/**
 * Created by achow on 2/13/17.
 */

public class Movie {
    public String title;
    public String posterUrl;
    public float score;

    public String getTitle() {
        return title;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public float getScore() {
        return score;
    }

    public Movie(String title, String posterUrl, float score) {
        this.title = title;
        this.posterUrl = posterUrl;
        this.score = score;
    }
    public String getScoreLabel() {
        return score + "%";
    }
    public static ArrayList<Movie> getFakeMovies() {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Intersteller", "", 98.0f));
        movies.add(new Movie("Braveheart", "", 99.0f));
        movies.add(new Movie("Intern", "", 50.0f));
        return movies;
    }
}
