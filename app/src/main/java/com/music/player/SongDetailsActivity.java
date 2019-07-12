package com.music.player;


import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SongDetailsActivity extends AppCompatActivity {

    private ImageView playMusic;
    private ImageView stopMusic;
    private ImageView pauseMusic;

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_details);

        final Music music = (Music) getIntent().getSerializableExtra("MUSIC");

        playMusic = findViewById(R.id.playMusic);
        stopMusic = findViewById(R.id.stopMusic);
        pauseMusic = findViewById(R.id.pauseMusic);

        play(music);

        playMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(music);
            }
        });

        stopMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stop();
            }
        });

        pauseMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                }
            }
        });
    }

    private void play(Music music) {
        if(mediaPlayer == null) {
            mediaPlayer = MediaPlayer.create(
                    SongDetailsActivity.this, Uri.parse(music.getData()));
        }

        if(!mediaPlayer.isPlaying()){
            mediaPlayer.start();
        }
    }

    private void stop() {
        if(mediaPlayer.isPlaying()){
            mediaPlayer.pause();
            mediaPlayer.seekTo(0);
        }
    }
}
