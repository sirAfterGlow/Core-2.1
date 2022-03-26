package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(List<Integer> list) {
        Stream stream = list.stream();

        List<Integer> resultList = list.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(resultList);
    }
}
