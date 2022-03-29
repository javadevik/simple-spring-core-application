package com.ua.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PopMusic implements Music {

    private final List<String> songs;

    public PopMusic() {
        songs = new ArrayList<>();
        songs.add("Olivia Rodrigo - \"good 4 u\"");
        songs.add("Giveon - \"Heartbreak Anniversary\"");
        songs.add("Adele - \"Easy On Me\"");
    }

    @Override
    public String getSong() {
        Random random = new Random();
        return songs.get(random.nextInt(songs.size()));
    }
}
