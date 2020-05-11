package Erzeugungsmuster.decorator.beforeUsingPattern;

public class SchnitzelMitPommes implements Gericht{

    @Override
    public double getPrice() {
        return 2.0;
    }

    @Override
    public void printDescription() {

        System.out.println("Schnitzel mit Pommes");
    }
}
