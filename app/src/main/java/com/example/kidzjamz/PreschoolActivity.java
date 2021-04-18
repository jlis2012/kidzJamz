package com.example.kidzjamz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class PreschoolActivity extends AppCompatActivity {
    //instantiating MediaPlayer class
    MediaPlayer music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preschoolplaylist);

        //add music file to newly created object music
        music=MediaPlayer.create(this, R.raw.bingo);
    }

    public void musicpause(View view) {
        music.pause();
    }

    public void musicplay(View view) {
        music.start();
    }

    public void musicstop(View view) {
        music.stop();
        music=MediaPlayer.create(this, R.raw.bingo);
    }
}