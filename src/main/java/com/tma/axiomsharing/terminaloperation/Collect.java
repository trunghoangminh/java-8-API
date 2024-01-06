package com.tma.axiomsharing.terminaloperation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1", "22", "333");
        List<Integer> integerList = strings.stream().map(Integer::parseInt).collect(Collectors.toList());
        Set<Integer> integerSet = strings.stream().map(Integer::parseInt).collect(Collectors.toSet());
        Map<Integer, Integer> integerMap = strings.stream().map(Integer::parseInt).collect(Collectors.toMap(Integer::intValue, Integer::intValue));
        String result = strings.stream().collect(Collectors.joining(","));
        Map<Integer, Set<String>> lengthMap = strings.stream().collect(Collectors.groupingBy(s -> s.length(), Collectors.toSet()));

        Predicate<String> predicate1 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 0;
            }
        };
        Predicate<String> predicate2 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 0;
            }
        };
        Function<String, String> function = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s + "1";
            }
        };
        //strings.stream().filter(predicate1).filter(predicate2);
        strings.stream().filter(predicate1).filter(predicate2).map(function).collect(Collectors.toList());
    }
}
