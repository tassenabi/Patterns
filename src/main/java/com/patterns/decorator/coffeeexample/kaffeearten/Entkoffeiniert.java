package com.patterns.decorator.coffeeexample.kaffeearten;

import com.patterns.decorator.coffeeexample.Getraenk;

public class Entkoffeiniert extends Getraenk {

    public Entkoffeiniert(){
        beschreibung = "Entkoffeiniert";
    }

    @Override
    public double preis() {
        return 1.05;
    }
}
