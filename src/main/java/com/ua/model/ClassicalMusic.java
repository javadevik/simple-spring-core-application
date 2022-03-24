package com.ua.model;

public class ClassicalMusic implements Music {

    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void init() {
        System.out.println("Do my init method");
    }

    public void destroy() {
        System.out.println("Do my destroy method");
    }

    @Override
    public String getSong() {
        return "Hungarian rhapsody";
    }
}
