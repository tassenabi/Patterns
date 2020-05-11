package Erzeugungsmuster.abstractFactory.beforeUsingPattern;

public class Regenwaldgenerator {

    public Elefant createElefant(){

        return new Elefant();
    }

    public Gras createGras(){

        return new Gras();
    }

    public Baum createBaum(){

        return new Baum();
    }

}
