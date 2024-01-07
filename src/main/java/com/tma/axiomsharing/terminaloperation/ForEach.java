package com.tma.axiomsharing.terminaloperation;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ForEach {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1", "2", "3");
        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        strings.forEach(consumer1);
        strings.stream().forEach(consumer1);

        Consumer<String> consumer2 = s -> System.out.println(s);
        strings.forEach(consumer2);
        strings.stream().forEach(consumer2);

        strings.forEach(s -> System.out.println(s));
        strings.forEach(System.out::println);
        strings.stream().forEach(s -> System.out.println(s));
        strings.stream().forEach(System.out::println);

        for (String str : strings) {
            System.out.println(str);
        }
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

        List<Integer> integers = Stream.iterate(0, i -> i + 1).limit(90).collect(Collectors.toList());
        Iterator<Integer> iterator = integers.iterator();

        // Old way
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // New way
        iterator.forEachRemaining(System.out::println);
    }
}
