package com.music.player;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        songList = findViewById(R.id.songList);
        arrayList = new ArrayList<>();
        arrayList.add(new Music("SLK", "Seen Enis", R.raw.seen_enis_slk));

        adapter = new CustomMusicAdapter(this, R.layout.music_details, arrayList);
        songList.setAdapter(adapter);
    }
}
