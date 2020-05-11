package Erzeugungsmuster.abstractFactory.withPatternUsing;

public class WüstenGenerator implements AbstractGenerator {

    @Override
    public Tier createTier(){
        return new Kamel();
    }

    @Override
    public Pflanze createPflanze(){
        return new Kaktus();
    }

    @Override
    public Untergrund createUntergrund(){
        return new Sand();
    }
}
