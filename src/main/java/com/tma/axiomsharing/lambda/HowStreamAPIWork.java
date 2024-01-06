package com.tma.axiomsharing.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HowStreamAPIWork {
    public static void main(String[] args) {
        List<String> sources = Arrays.asList("1", "2", "3");
        Predicate<String> predicate1 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 1;
            }
        };
        Predicate<String> predicate2 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 0;
            }
        };
        sources.stream().filter(predicate1).filter(predicate2).collect(Collectors.toList());
    }
}
