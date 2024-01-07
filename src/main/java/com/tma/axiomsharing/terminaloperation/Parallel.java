package com.tma.axiomsharing.terminaloperation;

import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Parallel {
    public static void main(String[] args) {
        List<Integer> integers = Stream.iterate(1, i -> i + 1).limit(100).collect(Collectors.toList());
        integers.parallelStream().forEach(System.out::println);

        Spliterator<Integer> spliterator1 = integers.spliterator();
        Spliterator<Integer> spliterator2 = spliterator1.trySplit();
        Spliterator<Integer> spliterator3 = spliterator1.trySplit();
        Spliterator<Integer> spliterator4 = spliterator2.trySplit();
        System.out.println("Split 1: " + spliterator1.estimateSize());
        System.out.println("Split 2: " + spliterator2.estimateSize());
        System.out.println("Split 3: " + spliterator3.estimateSize());
        System.out.println("Split 4: " + spliterator4.estimateSize());
        System.out.print("\nSplit 1: ");
        spliterator1.forEachRemaining(s -> System.out.print("_" + s));
        System.out.print("\nSplit 2: ");
        spliterator2.forEachRemaining(s -> System.out.print("_" + s));
        System.out.print("\nSplit 3: ");
        spliterator3.forEachRemaining(s -> System.out.print("_" + s));
        System.out.print("\nSplit 4: ");
        spliterator4.forEachRemaining(s -> System.out.print("_" + s));
    }
}
