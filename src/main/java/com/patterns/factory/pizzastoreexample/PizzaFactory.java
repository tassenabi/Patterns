package com.patterns.factory.pizzastoreexample;

public class PizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type == null || type.isEmpty())
            return null;
        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equalsIgnoreCase("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
