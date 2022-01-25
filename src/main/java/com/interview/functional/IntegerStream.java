package com.interview.functional;

import java.util.stream.IntStream;

public class IntegerStream {

    private static int sum;

    public static void main(String[] args) {
//        IntStream.range(1,10).forEach(System.out::println);
//        IntStream.range(1, 10)
//                .skip(5)
//                .forEach(System.out::println);
        sum = IntStream.range(1, 100).sum();
        System.out.println("sum = " + sum);
    }
}
