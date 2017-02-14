package com.applepluot.rottentomatoes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MovieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        ArrayList<Movie> movies = Movie.getFakeMovies();
        ListView lvMovies = (ListView) findViewById(R.id.lvMovies);
        MoviesAdapter adapter = new MoviesAdapter(this, movies);
        lvMovies.setAdapter(adapter);
    }
}
