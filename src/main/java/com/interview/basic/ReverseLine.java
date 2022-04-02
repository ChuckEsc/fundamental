package com.interview.basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.Collectors;

/**
 * @author yunfeng
 * @date 2022/3/25
 */
public class ReverseLine {
    public static void main(String[] args) {
        String spam = "this is a test";
        // expected output: "tset a si isht"
        String[] spamArr = spam.split(" ");
        Arrays.stream(spamArr).sorted(Comparator.reverseOrder()).collect(Collectors.toList()).toArray(spamArr);
        int length = spamArr.length;
//        for (int i = 0; i < length; i++) {
//            spamArr[i] = reverse(spamArr[i]);
//        }
        // TODO
        Arrays.stream(spamArr).forEach(item -> {
            item = reverse(item);
        });

        System.out.println(Arrays.toString(spamArr));
    }

    static <T> void swap(T[] arr, int first, int last) {
        T temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    static String reverse(String target) {
        StringBuilder temp = new StringBuilder();
        for (int i = target.length() - 1; i >= 0; i--) {
            temp.append(target.charAt(i));
        }
        return String.valueOf(temp);
    }
}
