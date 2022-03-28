package com.ua;

import com.ua.model.Genre;
import com.ua.model.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private Music classicalMusic;
    private Music rockMusic;
    private Music popMusic;

    private String name = "New musical player";
    private int volume = 60;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic,
                       @Qualifier("rockMusic") Music rockMusic,
                       @Qualifier("popMusic") Music popMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.popMusic = popMusic;
    }

    public void play(Genre genre) {
        System.out.println("======" + name + "======");
        if (genre.equals(Genre.CLASSICAL))
            System.out.println("Playing classical: " + classicalMusic.getSong());
        else if (genre.equals(Genre.ROCK))
            System.out.println("Playing rock: " + rockMusic.getSong());
        else
            System.out.println("Playing pop: " + popMusic.getSong());
    }
}
