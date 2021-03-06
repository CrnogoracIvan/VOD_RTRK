package com.example.ivancrnogorac.vod_rtrk.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import com.example.ivancrnogorac.vod_rtrk.R;
import com.example.ivancrnogorac.vod_rtrk.adapter.ImageAdapter;
import com.example.ivancrnogorac.vod_rtrk.model.MovieList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgLoader();
    }

    /** String keys for Intent */
    public static final String MOVIE_IMAGE = "image";
    public static final String MOVIE_DESCRIPTION = "desc";
    public static final String MOVIE_BACKGROUND = "background";
    public static final String MOVIE_ACTOR = "actor";
    public static final String MOVIE_NAME = "movie_name";
    public static final String MOVIE_VIDEO_TRAILER = "video_trailer";
    public static final String MOVIE_URL = "movie_url";

    private Integer moviesImages[] = {
            R.drawable.the_wolf_of_wall_street,
            R.drawable.rush,
            R.drawable.dark_knight_rises,
            R.drawable.how_to_train_your_dragon_2,
            R.drawable.the_expendables_3,
            R.drawable.the_amazing_spider_man_2,
            R.drawable.the_22_jump_street,
            R.drawable.guardians_of_the_galaxy,
            R.drawable.maleficent,
            R.drawable.toy_story_3,
            R.drawable.despicable_me_2,
            R.drawable.space_jam,
            R.drawable.godzilla,
            R.drawable.what_if,
            R.drawable.lets_be_cops
    };

    /** imgLoader created to ensure showing proper images with GridView component.*/
    private void imgLoader() {
        GridView gridView = (GridView) findViewById(R.id.gridView);
        ImageAdapter imageAdapter = new ImageAdapter(MainActivity.this, moviesImages);
        gridView.setAdapter(imageAdapter);

        /** On item click uses to fill fields movie name and actors with proper info.*/
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                TextView movieTitle = (TextView)findViewById(R.id.movieTitle);
                movieTitle.setText(MovieList.setupMovies().get(position).getMovie());

                TextView movieActors = (TextView)findViewById(R.id.actorsName);
                movieActors.setText(MovieList.setupMovies().get(position).getActors());
            }
        });

        /** This onLongItemClick  will send positioned details about clicked movie.
         Details will show on MovieDetailActivity */
       gridView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
           @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
               Intent intent = new Intent(MainActivity.this, MovieDetailActivity.class);
               intent.putExtra(MOVIE_IMAGE, MovieList.setupMovies().get(position).getImage());
               intent.putExtra(MOVIE_DESCRIPTION, MovieList.setupMovies().get(position).getDescription());
               intent.putExtra(MOVIE_BACKGROUND, MovieList.setupMovies().get(position).getBgImage());
               intent.putExtra(MOVIE_ACTOR, MovieList.setupMovies().get(position).getActors());
               intent.putExtra(MOVIE_NAME, MovieList.setupMovies().get(position).getMovie());
               intent.putExtra(MOVIE_VIDEO_TRAILER, MovieList.setupMovies().get(position).getVideoUrl());
               intent.putExtra(MOVIE_URL, MovieList.setupMovies().get(position).getUrl());

               startActivity(intent);
               return true;
           }
       });
    }
}