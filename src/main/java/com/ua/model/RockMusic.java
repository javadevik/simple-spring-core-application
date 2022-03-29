package com.ua.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RockMusic implements Music {

    private final List<String> songs;

    public RockMusic() {
        songs = new ArrayList<>();
        songs.add("Robert Plant and Alison Krauss, \"Can't Let Go\"");
        songs.add("Lindsey Buckingham, \"I Don't Mind\"");
        songs.add("Mammoth WVH, \"Don't Back Down\"");
    }

    @Override
    public String getSong() {
        Random random = new Random();
        return songs.get(random.nextInt(songs.size()));
    }
}
