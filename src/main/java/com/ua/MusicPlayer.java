package com.ua;

import com.ua.model.ClassicalMusic;
import com.ua.model.Music;
import com.ua.model.PopMusic;
import com.ua.model.RockMusic;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private final List<Music> musics = new ArrayList<>();

    private String name = "New musical player";
    private int volume = 60;

    public MusicPlayer(ClassicalMusic classicalMusic, PopMusic popMusic, RockMusic rockMusic) {
        musics.add(classicalMusic);
        musics.add(popMusic);
        musics.add(rockMusic);
    }

    public void play() {
        System.out.println("======" + name + "======");
        musics.forEach(music -> System.out.println(
                "\tPlaying: " + music.getSong() + "\tVolume:"  + volume
        ));
    }
}
