package com.music.player;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomMusicAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<Music> arrayList;
    private MediaPlayer mediaPlayer;
    private Boolean check = true;

    public CustomMusicAdapter(Context context, int layout, ArrayList<Music> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        TextView nameSong, nameSinger;
        ImageView playMusic, pauseMusic, stopMusic;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final ViewHolder viewHolder;
        if(convertView == null){

            viewHolder = new ViewHolder();
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = layoutInflater.inflate(layout,null);
            viewHolder.nameSong = convertView.findViewById(R.id.nameSong);
            viewHolder.nameSinger = convertView.findViewById(R.id.nameSinger);
            viewHolder.stopMusic = convertView.findViewById(R.id.stopMusic);
            viewHolder.playMusic = convertView.findViewById(R.id.playMusic);

            convertView.setTag(viewHolder);

        }else {

            viewHolder = (ViewHolder) convertView.getTag();
        }

        final Music music = arrayList.get(position);

        viewHolder.nameSong.setText(music.getName());
        viewHolder.nameSinger.setText(music.getSinger());

        viewHolder.playMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check){
                    mediaPlayer = MediaPlayer.create(context, Uri.parse(music.getData()));
                    check = false;
                }
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    viewHolder.playMusic.setImageResource(R.drawable.play_button);
                }else{
                        mediaPlayer.start();
                        viewHolder.playMusic.setImageResource(R.drawable.pause_button);

                }
            }
        });

        return convertView;
    }
}
