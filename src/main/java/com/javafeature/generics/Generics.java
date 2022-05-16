package com.javafeature.generics;

public class Generics {

    public static void main(String[] args) {

        shout("john");
        shout(52);

    }

    //Ohne Klassen-Typ-Parameter, nur an einer Methode dran
    private static <T> void shout (T thingToShout){

        System.out.println("thingToShout = " + thingToShout);
    }

    private static <T,V> T shoutTwoParameter (T thingToShout, V otherThingToShout){
        System.out.println("thingToShout = " + thingToShout + ", otherThingToShout = " + otherThingToShout);

        return thingToShout;
    }
}
