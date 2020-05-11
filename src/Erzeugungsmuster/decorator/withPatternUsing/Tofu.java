package Erzeugungsmuster.decorator.withPatternUsing;

public class Tofu implements Gericht {

    @Override
    public double getPrice() {
        return 0.5;
    }

    @Override
    public void printDescription() {
        System.out.println("Tofu");
    }
}
