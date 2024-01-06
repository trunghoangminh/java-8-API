package com.tma.axiomsharing.intermediateoperation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorted {
    public static void main(String[] args) {
        Comparator<String> comparator1 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() > o2.length() ? 1 : -1;
            }
        };
        List<String> sources = Arrays.asList("a", "bb", "ccc");
        sources.stream().sorted(comparator1);

        Comparator<String> comparator2 = (o1, o2) -> o1.length() > o2.length() ? 1 : -1;
        sources.stream().sorted(comparator2);

        sources.stream().sorted((o1, o2) -> o1.length() > o2.length() ? 1 : -1);
    }
}
