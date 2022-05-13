package com.patterns.observer.netflixExample;


public class Netflix {

    public static void main(String[] args){

        Channel action = new Channel("Action");
        Channel comedy = new Channel("Comedy");
        Channel disney = new Channel("Disney");

        Subscriber sebastian = new Subscriber("Sebastian");
        Subscriber faruq = new Subscriber("Faruq");
        Subscriber sai = new Subscriber("Sai");
        Subscriber oleks = new Subscriber("Oleks");
        Subscriber moussa = new Subscriber("Moussa");

        action.subscribe(sebastian);
        action.subscribe(faruq);
        action.subscribe(sai);
        comedy.subscribe(oleks);
        disney.subscribe(moussa);

        sebastian.subscribeChannel(action);
        faruq.subscribeChannel(action);
        sai.subscribeChannel(action);
        oleks.subscribeChannel(comedy);
        moussa.subscribeChannel(disney);

        action.uploadMovie("Squid Game");
        comedy.uploadMovie("Red Notice");
        disney.uploadMovie("Arielle, die Meerjungfrau");

        action.unsubscribe(faruq);
        action.uploadMovie("Avengers Endgame");

    }
}
