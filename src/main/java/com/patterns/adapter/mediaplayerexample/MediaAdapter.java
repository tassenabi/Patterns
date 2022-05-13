package com.patterns.adapter.mediaplayerexample;

import com.patterns.adapter.mediaplayerexample.advancedmediaplayer.AdvancedMediaPlayer;
import com.patterns.adapter.mediaplayerexample.advancedmediaplayer.Mp4Player;
import com.patterns.adapter.mediaplayerexample.advancedmediaplayer.VlcPlayer;
import com.patterns.adapter.mediaplayerexample.mediaplayer.MediaPlayer;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){

        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();

        }else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
