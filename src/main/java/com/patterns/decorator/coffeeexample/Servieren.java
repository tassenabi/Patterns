package com.patterns.decorator.coffeeexample;

import com.patterns.decorator.coffeeexample.kaffeearten.Entkoffeiniert;
import com.patterns.decorator.coffeeexample.kaffeearten.Espresso;
import com.patterns.decorator.coffeeexample.zutaten.Milchschaum;
import com.patterns.decorator.coffeeexample.zutaten.Soja;

public class Servieren {

    public static void main(String[] args) {

        Getraenk getraenk1 = new Espresso();
        getraenk1 = new Soja(getraenk1);
        System.out.println(getraenk1.getBeschreibung() + " " + getraenk1.preis() + " €");

        Getraenk getraenk2 = new Entkoffeiniert();
        //getraenk2.setGroesse(Getraenk.Groesse.TALL);
        getraenk2 = new Milchschaum(getraenk2);
        getraenk2 = new Soja(getraenk2);
        System.out.println(getraenk2.getBeschreibung() + " " + getraenk2.preis() + " €");
        //System.out.println(getraenk2.getBeschreibung() + " " + getraenk2.getGroesse() + " " + getraenk2.preis() + " €");

    }
}
