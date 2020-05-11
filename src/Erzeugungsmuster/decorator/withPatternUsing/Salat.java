package Erzeugungsmuster.decorator.withPatternUsing;

public class Salat extends Beilage {

    public Salat(Gericht gericht) {
        super(gericht);
    }
    public double getPrice(){

        return gericht.getPrice() + 3.5;
    }

    public void printDescription(){

        gericht.printDescription();
        System.out.println(", Salat");
    }
}
