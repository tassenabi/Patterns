package Erzeugungsmuster.decorator.withPatternUsing;

class Hueftsteak implements Gericht {

    @Override
    public double getPrice() {
        return 13.0;
    }

    @Override
    public void printDescription() {
        System.out.print("Hüftsteak");
    }
}