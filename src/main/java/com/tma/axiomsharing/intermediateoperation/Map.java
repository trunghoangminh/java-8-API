package com.tma.axiomsharing.intermediateoperation;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Map {
    public static void main(String[] args) {

        Function<String, Integer> function1 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        List<String> sources = Arrays.asList("a", "bb", "ccc");
        sources.stream().map(function1);

        Function<String, Integer> function2 = s -> s.length();
        sources.stream().map(function2);

        sources.stream().map(s -> s.length());

    }
}
