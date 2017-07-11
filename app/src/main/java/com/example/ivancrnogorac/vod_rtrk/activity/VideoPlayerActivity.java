package com.example.ivancrnogorac.vod_rtrk.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.ivancrnogorac.vod_rtrk.R;

public class VideoPlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);

        Intent intent = getIntent();
        String s = intent.getStringExtra(MovieDetailActivity.MOVIE_KEY);

        VideoView videoView = (VideoView) findViewById(R.id.vw_Video);
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        videoView.setVideoPath(s);
        videoView.start();

    }
}
