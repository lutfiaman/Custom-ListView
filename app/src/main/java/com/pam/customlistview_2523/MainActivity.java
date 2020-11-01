package com.pam.customlistview_2523;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String[] movie = {"Iron Man,","The Incredible Hulk","Thor"
            ,"Captain America","Iron Man 2","Avengers","Iron Man 3","The Winter Soldiers",
            "The Dark World","Age Of Ultron","Civil War","Homecoming","Black Panther","Thor: Ragnarok",
            "Captain Marvel","Infinity War","Endgame","Far From Home"};

    private String[] movieYear = {"2008","2008","2011","2011","2012","2012","2013",
    "2014","2014","2015","2016","2017","2017","2017","2018","2018","2019","2019"};
    private ArrayList<Movie> movieList;
    private ListView lv_movie;
    private MovieAdapter movieAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_movie = findViewById(R.id.lv_movie);
        movieList = new ArrayList<>();

        for (int i = 0; i < (movie.length); i++){
            Movie mov = new Movie(movie[i], movieYear[i]);
            movieList.add(mov);
        }

        movieAdapter = new MovieAdapter(this,R.layout.item_row,movieList);
        lv_movie.setAdapter(movieAdapter);
    }
}