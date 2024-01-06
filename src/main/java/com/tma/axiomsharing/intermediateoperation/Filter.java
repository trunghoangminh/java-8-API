package com.tma.axiomsharing.intermediateoperation;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Predicate<String> predicate1 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 2;
            }
        };
        List<String> sources = Arrays.asList("a", "bb", "ccc");
        sources.stream().filter(predicate1);

        Predicate<String> predicate2 = s -> s.length() > 2;
        sources.stream().filter(predicate2);

        sources.stream().filter(s -> s.length() > 2);
    }
}
