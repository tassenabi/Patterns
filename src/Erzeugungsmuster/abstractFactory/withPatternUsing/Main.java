package Erzeugungsmuster.abstractFactory.withPatternUsing;

public class Main {

    public static void main(String[] args) {

        AbstractGenerator generatore = new Polargebietgenerator();

        Pflanze pflanze = generatore.createPflanze();
    }
}
