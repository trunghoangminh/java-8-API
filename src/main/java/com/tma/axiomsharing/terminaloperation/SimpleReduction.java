package com.tma.axiomsharing.terminaloperation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SimpleReduction {

    public static void main(String[] args) {
        List<Integer> sources = Arrays.asList(1, 2, 3);
        Optional<Integer> max = sources.stream().max(Integer::compareTo);
        Optional<Integer> min = sources.stream().min(Integer::compareTo);
        Optional<Integer> findFirst = sources.stream().findFirst();
        Optional<Integer> findAny = sources.stream().findAny();
        boolean anyMatch = sources.stream().anyMatch(m -> m >= 1);
        boolean allMatch = sources.stream().allMatch(m -> m >= 1);
        boolean noneMatch = sources.stream().noneMatch(m -> m < 1);

        max.get();
        if (max.isPresent()) {
            max.get();
        }
        max.orElse(0);
        max.orElseGet(() -> 0 );
        max.orElseThrow(IllegalArgumentException::new);
    }
}
