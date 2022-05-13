package com.patterns.factory.pizzastoreexample;

public class PizzaStore {

    PizzaFactory simplePizzaFactory;

    public PizzaStore(PizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type) {

        var pizza = simplePizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
