package com.tma.axiomsharing.intermediateoperation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Distinct {
    public static void main(String[] args) {
        List<String> sources = Arrays.asList("a", "bb", "ccc");
        sources.stream().distinct();
    }
}
