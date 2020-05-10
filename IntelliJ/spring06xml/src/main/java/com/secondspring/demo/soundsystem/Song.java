package com.secondspring.demo.soundsystem;

public class Song {

    private String title;
    private Integer duration;

    public Song() {
    }

    public Song(String title, Integer duration) {
        this.title = title;
        this.duration = duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
