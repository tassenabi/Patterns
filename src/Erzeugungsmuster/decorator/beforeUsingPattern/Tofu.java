package Erzeugungsmuster.decorator.beforeUsingPattern;

public class Tofu implements Gericht {


    @Override
    public double getPrice() {
        return 0.50;
    }

    @Override
    public void printDescription() {

        System.out.print("Tofu");
    }
}
