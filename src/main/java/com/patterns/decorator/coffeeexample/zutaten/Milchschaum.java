package com.patterns.decorator.coffeeexample.zutaten;

import com.patterns.decorator.coffeeexample.Getraenk;
import com.patterns.decorator.coffeeexample.ZutatDekorierer;

public class Milchschaum extends ZutatDekorierer {

    Getraenk getraenk;

    public Milchschaum(Getraenk getraenk){
        this.getraenk = getraenk;
    }
    @Override
    public double preis() {
        return 0.20 + getraenk.preis();
    }

    @Override
    public String getBeschreibung() {
        return this.getraenk.getBeschreibung() + ", mit Schoko";
    }
}
