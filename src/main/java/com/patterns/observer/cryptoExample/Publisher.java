package com.patterns.observer.cryptoExample;

public interface Publisher {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers(double value);
}
