package com.patterns.decorator.pizzaexample;

public class Servieren {

    public static void main(String[] args){

        Pizza basicPizza = new Mozzarella(new MargaritaPizza());
        System.out.println("Ingredients: " + basicPizza.getDescription());
    }
}
