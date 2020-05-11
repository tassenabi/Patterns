package Erzeugungsmuster.decorator.withPatternUsing;

public interface Gericht {

    /**Für jedes Basisgericht und  jede Beilage eine einzelne Klasse schreiben und diese dynamisch kombinieren
     */

    double getPrice();
    void printDescription();

}