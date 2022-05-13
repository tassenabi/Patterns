package com.patterns.decorator.pizzaexample;

public class MargaritaPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Marga";
    }

    @Override
    public double getCost() {
        return 4;
    }
}
