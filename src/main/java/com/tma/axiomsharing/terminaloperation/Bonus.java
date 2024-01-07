package com.tma.axiomsharing.terminaloperation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bonus {
    private static int globalIndex = 0;

    public static void main(String[] args) {
        List<Integer> integers = Stream.iterate(1, i -> i + 1).limit(10).collect(Collectors.toList());
        int localIndex = 0;
        integers.forEach(s -> {
            // localIndex++; compile error
            globalIndex++;
        });
    }
}
