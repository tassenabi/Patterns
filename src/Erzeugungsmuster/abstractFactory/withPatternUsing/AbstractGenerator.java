package Erzeugungsmuster.abstractFactory.withPatternUsing;

public interface AbstractGenerator {

    public Tier createTier();
    public Pflanze createPflanze();
    public Untergrund createUntergrund();

}
