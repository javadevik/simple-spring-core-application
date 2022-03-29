package com.ua.config;

import com.ua.MusicPlayer;
import com.ua.model.ClassicalMusic;
import com.ua.model.Music;
import com.ua.model.PopMusic;
import com.ua.model.RockMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public Music classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public PopMusic popMusic() {
        return new PopMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(
                classicalMusic(),
                rockMusic(),
                popMusic()
        );
    }

}
