package com.interview.basic;

import java.util.Arrays;
import java.util.List;

public class eq {
    public static void main(String[] args) {

        String s1 = new String("老王");
        String s2 = new String("老王");
        System.out.println(s1.equals(s2)); // true

        List<Integer> list = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(1, 2, 3);

        System.out.println("list.equals(list2) = " + list.equals(list2));
        System.out.println("(list == list2) = " + (list == list2));
    }
}
