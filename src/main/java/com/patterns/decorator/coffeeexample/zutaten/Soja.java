package com.patterns.decorator.coffeeexample.zutaten;

import com.patterns.decorator.coffeeexample.Getraenk;
import com.patterns.decorator.coffeeexample.ZutatDekorierer;

public class Soja extends ZutatDekorierer {

    Getraenk getraenk;

    public Soja(Getraenk getraenk){
        this.getraenk = getraenk;
    }
    @Override
    public double preis() {
        return 0.10 + getraenk.preis();
    }

    @Override
    public String getBeschreibung() {
        return this.getraenk.getBeschreibung() + ", Soja";
    }
}
