package com.music.player;

public class Music {

    private String name;
    private String singer;
    private String data;

    public Music(String name, String singer, String data) {
        this.name = name;
        this.singer = singer;
        this.data = data;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
