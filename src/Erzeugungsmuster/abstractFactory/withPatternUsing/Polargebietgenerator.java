package Erzeugungsmuster.abstractFactory.withPatternUsing;

public class Polargebietgenerator implements AbstractGenerator {

    @Override
    public Tier createTier() {
        return new Eisbär();
    }

    @Override
    public Pflanze createPflanze() {
        return new Flechte();
    }

    @Override
    public Untergrund createUntergrund() {
        return new Schnee();
    }
}
