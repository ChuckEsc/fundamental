package com.interview.collection;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Money {
    public static void main(String[] args) {
        final MathContext mathContext = new MathContext(4);
        BigDecimal bigDecimal = new BigDecimal("3.14159260767965", MathContext.DECIMAL32);
        System.out.println("bigDecimal = " + bigDecimal);

        int[] arr = {6,1,2,3,7,5,9};
        Arrays.stream(arr).sorted().forEach(System.out::println);
        List<Integer> integers = Arrays.asList(6,1,2,3,7,5,9);
        integers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println("integers = " + Arrays.toString(integers.toArray()));
        System.out.println("Arrays.binarySearch(arr, 6) = " + Arrays.binarySearch(arr, 6));

        Arrays.sort(arr);
        int i = Arrays.binarySearch(arr, 6);
        System.out.println("i = " + i);
    }
}
