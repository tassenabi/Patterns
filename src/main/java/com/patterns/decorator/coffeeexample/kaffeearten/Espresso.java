package com.patterns.decorator.coffeeexample.kaffeearten;

import com.patterns.decorator.coffeeexample.Getraenk;

public class Espresso extends Getraenk {

    public Espresso(){
        beschreibung = "Espresso";
    }

    @Override
    public double preis() {
        return 1.99;
    }
}
