package com.zh.maniuplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamManipulated {

    public static void main(String[] args) {
        stream2();
    }

    static void stream2(){
        List<String> list = Arrays.asList("nothing", "compare", "to", "you", "only", "way", "can");
//        ArrayList<String> strings = new ArrayList<>();
        System.out.println("list = " + list.getClass());
        System.out.println("list.stream().sorted().collect(Collectors.toList()) = " + list.stream().sorted().collect(Collectors.toList()));
        System.out.println("list.stream().filter(str -> str.length() >= 3).collect(Collectors.toList()) = " + list.stream().filter(str -> str.length() >= 3).collect(Collectors.toList()));
    }

    static void stream1(){
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            int nextInt = random.nextInt(2000);
            integers.add(nextInt);
        }

        integers.stream().filter(integer -> integer>1500).forEach(integer -> System.out.println(integer));
        System.out.println("integers.stream().max(Integer::compareTo).get() = " + integers.stream().max(Integer::compareTo).get());
        System.out.println("integers.stream().sorted() = " + integers.stream().sorted().collect(Collectors.toList()));
        System.out.println("integers = " + integers);
    }
}
