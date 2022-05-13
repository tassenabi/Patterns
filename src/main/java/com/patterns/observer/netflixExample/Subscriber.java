package com.patterns.observer.netflixExample;

public class Subscriber {

    private String name;
    private Channel channel;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(){
        System.out.println("Hallo " + name + ", es gibt auf dem Channel: " + channel.name + " den neuen Film: " + channel.title);
    };

    // zeigt, auf welchem Channel subscribed wurde
    public void subscribeChannel(Channel ch){
        this.channel = ch;
    };

}
