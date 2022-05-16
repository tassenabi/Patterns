package com.javafeature.lambda.functionalInterfaceAnnotation;

public class Main {

    public static void main(String[] args) {

        MathOperation add = (int a, int b) -> a + b;
        int addResult = add.doSomeMath(5, 7);

        MathOperation multiply = (int a, int b) -> a * b;
        int multiplyResult = multiply.doSomeMath(2, 3);

        System.out.println(addResult);
        System.out.println(multiplyResult);

    }

}
