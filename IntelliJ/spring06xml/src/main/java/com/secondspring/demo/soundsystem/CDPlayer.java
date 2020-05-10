package com.secondspring.demo.soundsystem;

public class CDPlayer {

    private CompactDisc cd;

    public CDPlayer(CompactDisc cd) {
        System.out.println("constructor with cd input");
        this.cd = cd;
    }

    public CDPlayer() {
        System.out.println("constructor");
    }

    public void play(){
        cd.play();
    }
}
