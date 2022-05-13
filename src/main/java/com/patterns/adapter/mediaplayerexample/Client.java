package com.patterns.adapter.mediaplayerexample;

import com.patterns.adapter.mediaplayerexample.mediaplayer.AudioPlayer;

public class Client {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "chainSmokers.mp3");
        audioPlayer.play("mp4", "maroon5.mp4");
        audioPlayer.play("vlc", "despacito.vlc");
        audioPlayer.play("avi", "Dilse.avi");
    }
}
