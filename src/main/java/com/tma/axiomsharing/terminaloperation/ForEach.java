package com.tma.axiomsharing.terminaloperation;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1", "2", "3");
        strings.stream().forEach(str -> {
            System.out.println(str);
        });
        strings.stream().spliterator().forEachRemaining(str -> {
            System.out.println(str);
        });
        int i = 0;
        strings.forEach(str -> {
            i++; // compile error
            System.out.println(str);
        });
        for (String str : strings) {
            System.out.println(str);
        }
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
