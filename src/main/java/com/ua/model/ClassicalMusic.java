package com.ua.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassicalMusic implements Music {

    private final List<String> songs;

    public ClassicalMusic(){
        songs = new ArrayList<>();
        songs.add("«К Элизе», Людвиг ван Бетховен");
        songs.add("«Турецкое рондо», Вольфганг Амадей Моцарт");
        songs.add("«Аве Мария», Франц Шуберт");
    }

    @PostConstruct
    public void init() {
        System.out.println("Do my init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Do my destroy method");
    }

    @Override
    public String getSong() {
        Random random = new Random();
        return songs.get(random.nextInt(songs.size()));
    }
}
