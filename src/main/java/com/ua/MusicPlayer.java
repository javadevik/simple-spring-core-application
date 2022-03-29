package com.ua;

import com.ua.model.Genre;
import com.ua.model.Music;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MusicPlayer {

    private Music classicalMusic;
    private Music rockMusic;
    private Music popMusic;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic,
                       @Qualifier("rockMusic") Music rockMusic,
                       @Qualifier("popMusic") Music popMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.popMusic = popMusic;
    }

    public void play(Genre genre) {
        System.out.println("======" + name + "======\nVolume: " + volume);
        if (genre.equals(Genre.CLASSICAL))
            System.out.println("Playing classical: " + classicalMusic.getSong());
        else if (genre.equals(Genre.ROCK))
            System.out.println("Playing rock: " + rockMusic.getSong());
        else
            System.out.println("Playing pop: " + popMusic.getSong());
    }
}
