package com.javafeature.lambda.Predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NamesFinder {
    static List<String> filterNames(List<String> names, Predicate<String> condition) {
        return names.stream()
                .filter(condition::test)
                .collect(Collectors.toList());
    }
}
