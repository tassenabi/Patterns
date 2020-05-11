package Erzeugungsmuster.abstractFactory.withPatternUsing;

public class RegenwaldGenerator implements AbstractGenerator {

    @Override
    public Tier createTier() {
        return new Elefant();
    }

    @Override
    public Pflanze createPflanze() {
        return new Baum();
    }

    @Override
    public Untergrund createUntergrund() {
        return new Gras();
    }
}
