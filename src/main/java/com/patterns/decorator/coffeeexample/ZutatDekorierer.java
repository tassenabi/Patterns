package com.patterns.decorator.coffeeexample;

public abstract class ZutatDekorierer extends Getraenk {

    //die Zutaten-Dekorierer muessen alle diese Methode neu implementieren
    public abstract String getBeschreibung();

}
