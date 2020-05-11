package Erzeugungsmuster.decorator.withPatternUsing;

public class Pommes extends Beilage {

    public Pommes(Gericht gericht) {
        super(gericht);
    }
    public double getPrice(){

        return gericht.getPrice() + 2.5;
    }

    public void printDescription(){

        gericht.printDescription();
        System.out.println(", Pommes");
    }
}
