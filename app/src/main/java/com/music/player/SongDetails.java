package com.music.player;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SongDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_details);

        Music music = (Music) getIntent().getSerializableExtra("MUSIC");

    }


}
