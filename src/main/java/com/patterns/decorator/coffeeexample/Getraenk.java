package com.patterns.decorator.coffeeexample;

public abstract class Getraenk {


    //Groesse groesse = Groesse.TALL;

    public String beschreibung = "Unbekanntes Getraenk";

    //bereits implementiert
    public String getBeschreibung(){
        return this.beschreibung;
    }

    //muss von Subklassen implementiert werden
    public abstract double preis();


}
