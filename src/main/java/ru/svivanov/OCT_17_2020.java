package ru.svivanov;

import java.util.stream.Stream;

public class OCT_17_2020 {
    public static void main(String[] args) {
        Stream.of("c1","c2","c3")
                .map(n -> n.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);
    }
}
