package com.patterns.factory.pizzastoreexample;

public class OrderPizza {

    public static void main(String[] args) {

        var simplePizzaFactory = new PizzaFactory();
        var pizzaStore = new PizzaStore(simplePizzaFactory);

        var piza = pizzaStore.orderPizza("cheese");
        System.out.println(piza.getName() + " is ready!\n");


        piza = pizzaStore.orderPizza("veggie");
        System.out.println(piza.getName() + " is ready!\n");
    }
}
