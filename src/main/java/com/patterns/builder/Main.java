package com.patterns.builder;

public class Main {

    public static void main(String[] args) {

        Mandant mandant1 = new Mandant.MandantenBuilder("Rolf", "Anwalt")
                .withMandantenNummer(3012328)
                .withAdresse("Nuernbergstrasse 1234")
                .build();

        System.out.println(mandant1);

        Mandant mandant2 = new Mandant.MandantenBuilder("Sai", "Bond")
                .withMandantenNummer(40)
                //keine Adresse
                .build();

        System.out.println(mandant2);

        Mandant mandant3 = new Mandant.MandantenBuilder("Moussa", "Java")
                //keine Mandantennummer
                //keine Adresse
                .build();

        System.out.println(mandant3);
    }
}
