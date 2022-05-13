package com.javafeature.lambda.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> sexyNames = Arrays.asList("Sebastian", "Oleks", "Moussa", "Faruq", "Sai", "Thanh");

        // standard way to filter
        List<String> result = sexyNames.stream()
                .filter(names -> names.startsWith("S"))
                .collect(Collectors.toList());
        System.out.println("result: " + result);

        // cool way to filter using Predicate
        Predicate<String> startsWithS = names -> names.startsWith("S");

        List<String> predicateResult = sexyNames.stream()
                .filter(startsWithS)
                .collect(Collectors.toList());
        System.out.println("predicateResult: " + predicateResult);

        // Predicate in combination with .and() / .or() / .negate()
        Predicate<String> containsE = names -> names.contains("e");

        List<String> andResult = sexyNames.stream()
                .filter(startsWithS.and(containsE))
                .collect(Collectors.toList());
        System.out.println("andResult: " + andResult);

        List<String> orResult = sexyNames.stream()
                .filter(startsWithS.or(containsE))
                .collect(Collectors.toList());
        System.out.println("orResult: " + orResult);

        List<String> negateResult = sexyNames.stream()
                .filter(startsWithS.negate())
                .collect(Collectors.toList());
        System.out.println("negateResult: " + negateResult);

        // Predicate in functions
        List<String> functionResult = NamesFinder.filterNames(sexyNames, startsWithS);
        System.out.println("functionResult: " + functionResult);

    }
}
