package com.patterns.observer.netflixExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Channel implements Publisher {

    // Default: Object equality = Object identity --> 2 "gleiche" Channels sind NICHT equal, weil es 2 verschiedene Instanzen sind
    // @Override --> vergleicht nicht nur Object identity, sondern auch die Werte der relevanten Properties!
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Channel channel = (Channel) o;
        return name.equals(channel.name) && subscribers.equals(channel.subscribers) && title.equals(channel.title);
    }

    // Beim Erstellen einer neuen Instanz von Channel wird ein HashCode generiert, welcher als Identifier in der Collection dient.
    // Über diesen HashCode kann eine bestimmte Instanz gesucht und identifiziert werden.
    // Wenn 2 Objekte / Instanzen identisch sind, müssen deren HashCodes auch identisch sein.
    @Override
    public int hashCode() {
        return Objects.hash(name, subscribers, title);
    }

    public String name;
    private List<Subscriber> subscribers = new ArrayList<>();
    public String title;

    public Channel(String name) {
        this.name = name;
    }

    @Override
    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(){
        for (Subscriber subscriber : subscribers) {
            subscriber.update();
        }
    }

    public void uploadMovie(String title){
        this.title = title;
        notifySubscribers();
    }

}
