package com.ua;

import com.ua.model.Music;

import java.util.List;

public class MusicPlayer {
    private List<Music> musics;

    private String name;
    private int volume;

    public void setMusics(List<Music> musics) {
        this.musics = musics;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void play() {
        System.out.println("======" + name + "======");
        musics.forEach(music -> System.out.println(
                "\tPlaying: " + music.getSong() + "\tVolume:"  + volume
        ));
    }
}
