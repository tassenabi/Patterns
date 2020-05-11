package Erzeugungsmuster.decorator.beforeUsingPattern;

public class SchnitzelMitPommesMitMajo implements Gericht{

    @Override
    public double getPrice() {
        return 3.0;
    }

    @Override
    public void printDescription() {

        System.out.println("Schnitzel mit Pommes und Majo");
    }
}
