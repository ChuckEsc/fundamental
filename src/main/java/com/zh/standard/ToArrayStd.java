package com.zh.standard;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author yunfeng
 */
public class ToArrayStd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        // negative example
        // casting 'list.toArray()' to 'integer[]' will produce 'ClassCastException' for any non-null value
        Integer[] array = (Integer[]) list.toArray();
        // positive example
        Integer[] arrayRight = (Integer[]) list.toArray(new Integer[list.size()]);
        Arrays.stream(arrayRight).forEach(System.out::println);
        System.out.println("Arrays.toString(arrayRight) = " + Arrays.toString(arrayRight));
    }
}
