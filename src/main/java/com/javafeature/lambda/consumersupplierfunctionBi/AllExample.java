package com.javafeature.lambda.consumersupplierfunctionBi;

import java.util.function.*;

public class AllExample {

    //Predicate -> boolean result
    //consumer -> no result
    //Function -> input and output
    //supplier -> no input, only output
    //BiFunction ->

    public static void main(String[] args){

        //1. Beispiel Predicate
        Predicate<String> checkLength = x -> x.length()>5;
        checkLength.test("Robertttt");

        //2. Beispiel Predicate
        Predicate<Person> youngerThen = x -> x.getAge()>5;

        //Consumer Beispiel
        Person p = new Person();
        Consumer<Person> setName = x -> x.setName("Neuer Name");
        setName.accept(p);

        //Functino Beispiele (Integer -> Input, String Output)
        Function<Integer, String> getInt = t -> t*10 + " Jahre alt";
        System.out.println(getInt.apply(2));

        //Supplier Beispiel
        Supplier<Double> getRandomNumber = () -> Math.random();
        System.out.println(getRandomNumber.get());

        //BiFunction 1. Beispiel
        BiFunction<Integer, Integer, Integer> biFunction = (t, u) -> (t+u);
        System.out.println(biFunction.apply(10,20));
    }
}