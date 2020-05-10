package com.secondspring.demo.soundsystem;

import java.util.List;

public class CompactDisc {


    private String title;
    private String artist;
    private List<Song> tracks;

    public CompactDisc(String title, String artise) {
        System.out.println("construotor with two input value");
        this.title = title;
        this.artist = artise;
        System.out.println("CompactDisc " + this.toString());

    }

    public CompactDisc() {
        System.out.println("CompactDisc " + this.toString());
    }

    public void play(){
        System.out.println("cd playing " + this.toString());
    }

    @Override
    public String toString() {
        return "CompactDisc{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", tracks=" + tracks +
                '}';
    }
}
