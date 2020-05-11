package Erzeugungsmuster.decorator.beforeUsingPattern;

public interface Gericht {

    /**
     * Nachteile:
     * - Wartungsaufwand --> neue Beilage heißt neue Klassen
     * - Mangelnde Flexibilität --> doppelte Portion Pommes nicht möglich
     * - Beilagen können nicht dynamisch, d.h. zur Laufzeit hinzugefügt werden
     */
    double getPrice();
    void printDescription();

}
