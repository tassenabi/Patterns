package Erzeugungsmuster.abstractFactory.beforeUsingPattern;

public class Main {

    public static void main(String[] args) {

        Regenwaldgenerator regenwaldgenerator = new Regenwaldgenerator();
        Gras gras = regenwaldgenerator.createGras();

    }
}
