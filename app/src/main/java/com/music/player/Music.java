package com.music.player;

public class Music {

    private String name;
    private String singer;
    private Integer song;

    public Music(String name, String singer, Integer song) {
        this.name = name;
        this.singer = singer;
        this.song = song;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public Integer getSong() {
        return song;
    }

    public void setSong(Integer song) {
        this.song = song;
    }
}
