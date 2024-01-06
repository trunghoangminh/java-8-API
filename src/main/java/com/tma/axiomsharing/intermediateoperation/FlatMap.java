package com.tma.axiomsharing.intermediateoperation;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
        List<List<String>> sources = Arrays.asList(
            Arrays.asList("a", "b", "c"),
            Arrays.asList("x", "y", "z"));

        Function<List<String>, Stream<String>> function1 = new Function<List<String>, Stream<String>>() {
            @Override
            public Stream<String> apply(List<String> strings) {
                return strings.stream();
            }
        };
        sources.stream().flatMap(function1);
        Function<List<String>, Stream<String>> function2 = strings -> strings.stream();
        sources.stream().flatMap(function2);

        System.out.println(sources.stream().flatMap(strings -> strings.stream()).collect(Collectors.toList()));
    }
}
