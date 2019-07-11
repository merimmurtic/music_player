package com.music.player;


import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SongDetailsActivity extends AppCompatActivity {

    private ImageView playMusic;
    private ImageView stopMusic;
    private ImageView pauseMusic;
    static MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_details);

        Music music = (Music) getIntent().getSerializableExtra("MUSIC");

        playMusic = findViewById(R.id.playMusic);
        stopMusic = findViewById(R.id.stopMusic);
        pauseMusic = findViewById(R.id.pauseMusic);

    }







}
