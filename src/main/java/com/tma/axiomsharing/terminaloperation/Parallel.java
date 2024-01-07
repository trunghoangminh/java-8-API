package com.tma.axiomsharing.terminaloperation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Parallel {
    public static void main(String[] args) {
        List<Integer> integers = Stream.iterate(0, i -> i + 1).limit(20).collect(Collectors.toList());
        integers.parallelStream().forEach(System.out::println);
    }
}
