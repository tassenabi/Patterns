package com.patterns.adapter.mediaplayerexample.advancedmediaplayer;


public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String filenames) {
    }
}
