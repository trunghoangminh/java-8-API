package com.tma.axiomsharing.terminaloperation;

import java.util.Arrays;
import java.util.List;

public class Parallel {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1", "2", "3");
        strings.parallelStream().forEach(str -> {
            System.out.println(str);
        });
    }
}
