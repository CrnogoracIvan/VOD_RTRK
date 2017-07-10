package com.example.ivancrnogorac.vod_rtrk.activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.ivancrnogorac.vod_rtrk.R;

public class MovieDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);


        Intent intent = getIntent();

        String image = intent.getStringExtra(MainActivity.IMAGE);
        String description = intent.getStringExtra(MainActivity.DESCRIPTION);
        String background = intent.getStringExtra(MainActivity.BACKGROUND);
        String actor = intent.getStringExtra(MainActivity.ACTOR);
        String movie = intent.getStringExtra(MainActivity.MOVIE_NAME);
        final String trailer = intent.getStringExtra(MainActivity.VIDEO_TRAILER);
        final String url = intent.getStringExtra(MainActivity.URL);

        ImageView myImage = (ImageView) findViewById(R.id.iv_detail_image);
        Glide.with(this).load(image).into(myImage);

        ImageView myBackground = (ImageView) findViewById(R.id.iv_details_background);
        myBackground.getMaxHeight();
        Glide.with(this).load(background).into(myBackground);

        TextView myMovie = (TextView) findViewById(R.id.tv_details_movie_name);
        myMovie.setText(movie);

        TextView myDescription = (TextView) findViewById(R.id.tv_details_description);
        myDescription.setText(description);

        TextView myActor = (TextView) findViewById(R.id.tv_details_actor);
        myActor.setText(actor);

        /** Click on Imdb button show details about selected movie in built-in browser.
         After launching browser, details are shown shows IMDb search result. */

        Button imdb = (Button) findViewById(R.id.btn_details_imdb);
        imdb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        /** Click on myPlay button will open MoviePlayerActivity and show trailer for selected movie */

//        Button myPlay = (Button) findViewById(R.id.btn_details_play);
//        myPlay.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent1 = new Intent(MovieDetailsActivity.this, MoviePlayerActivity.class);
//                intent1.putExtra(VIDEO_KEY, trailer);
//                startActivity(intent1);
//            }
//        });
    }


}
