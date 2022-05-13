package com.patterns.observer.cryptoExample;

public class Observer {

    private String name;

    public Observer(String name) {
        this.name = name;
    }

    public void update(String currencyName, double currencyValue){
        System.out.println("Hallo " + this.name + ", der Wert von " + currencyName + " hat sich aktualisiert auf: " + currencyValue);
    };

}
