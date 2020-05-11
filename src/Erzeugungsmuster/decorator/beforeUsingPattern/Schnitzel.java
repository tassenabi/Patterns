package Erzeugungsmuster.decorator.beforeUsingPattern;

public class Schnitzel implements Gericht {

    @Override
    public double getPrice() {
        return 1.0;
    }

    @Override
    public void printDescription() {

        System.out.println("Schnitzel");
    }
}
