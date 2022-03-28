package com.ua.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {

    private final List<String> songs;

    public ClassicalMusic(){
        songs = new ArrayList<>();
        songs.add("«К Элизе», Людвиг ван Бетховен");
        songs.add("«Турецкое рондо», Вольфганг Амадей Моцарт");
        songs.add("«Аве Мария», Франц Шуберт");
    }

    public void init() {
        System.out.println("Do my init method");
    }

    public void destroy() {
        System.out.println("Do my destroy method");
    }

    @Override
    public String getSong() {
        Random random = new Random();
        return songs.get(random.nextInt(songs.size()));
    }
}
