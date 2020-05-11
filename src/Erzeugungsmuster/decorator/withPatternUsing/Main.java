package Erzeugungsmuster.decorator.withPatternUsing;

public class Main {

    public static void main(String[] args) {

        Gericht gericht = new Pommes(new Salat(new Hueftsteak()));

        gericht.printDescription();
    }
}
