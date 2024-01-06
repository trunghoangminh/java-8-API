package com.tma.axiomsharing.source;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) throws IOException {
        Stream<String> messages1 = Stream.of("H", "e", "l", "l", "o");

        Stream<String> messages2 = Stream.empty();

        Stream<String> messages3 = Stream.generate(() -> "Hello world!");

        Stream<Integer> integers = Stream.<Integer>iterate(0, t -> t + 1);

        Stream<String> lines = Files.lines(Paths.get("./demo.txt"));

        Stream<String> words = Pattern.compile("\\.").splitAsStream("a.b.c");
        Stream.Builder<Integer> integerStreamBuilder = Stream.builder();
        integerStreamBuilder.accept(1);
        integerStreamBuilder.accept(2);
        integerStreamBuilder.accept(3);
    }
}
