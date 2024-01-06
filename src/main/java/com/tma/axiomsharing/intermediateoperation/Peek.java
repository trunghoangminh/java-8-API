package com.tma.axiomsharing.intermediateoperation;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Peek {

    public static void main(String[] args) {

        List<String> sources = Arrays.asList("a", "bb", "ccc");
        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        sources.stream().peek(consumer1);

        Consumer<String> consumer2 = s -> System.out.println(s);
        sources.stream().peek(consumer2);

        sources.stream().peek(s -> System.out.println(s));
        sources.stream().peek(System.out::println);
    }
}
