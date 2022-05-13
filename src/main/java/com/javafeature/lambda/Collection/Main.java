package com.javafeature.lambda.Collection;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> sexyNames = Arrays.asList("Sebastian", "Oleks", "Moussa", "Faruq", "Sai", "Thanh");

        // filter-map-reduce
        // map --> returns another List depending on the condition
        List mapList = sexyNames.stream()
                .map(names -> names.length())
                .collect(Collectors.toList());
        System.out.println(mapList);

        // reduce --> turns a stream into a value as result, for example sum, maximum, minimum of a collection
        // returns an Optional, because result could possibly be null
        Optional<String> shortestName = sexyNames.stream()
                .reduce((name1, name2) -> name1.length() < name2.length() ? name1 : name2);
        shortestName.ifPresent(System.out::println);

        // flatmap --> turns nested Arrays into a simple Array
        List<List<String>> sexyNamePairs = Arrays.asList(Arrays.asList("1", "Sebastian"), Arrays.asList("2", "Oleks"),
                                        Arrays.asList("3", "Moussa"), Arrays.asList("4", "Faruq"), Arrays.asList("5", "Sai"), Arrays.asList("6", "Thanh"));
        System.out.println("nested Name List: " + sexyNamePairs);

        List<String> flatList = sexyNamePairs.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        System.out.println("simple Name List: " + flatList);

    }
}
