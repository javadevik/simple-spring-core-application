package com.ua;

import com.ua.config.SpringConfig;
import com.ua.model.Genre;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.play(Genre.CLASSICAL);

        context.close();

    }
}
