package com.interview.functional;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class IntSummary {
    public static void main(String[] args) {
        IntSummaryStatistics intSummaryStatistics = IntStream.of(5, 2, 4, 8, 9, 7, 0, 1).summaryStatistics();
        System.out.println("intSummaryStatistics = " + intSummaryStatistics);
        long sum = intSummaryStatistics.getSum();
        long count = intSummaryStatistics.getCount();
        double average = intSummaryStatistics.getAverage();

        List<Integer> numList = Arrays.asList(1,2,3,4,5);
        int result = numList.stream().reduce((a,b) -> {
            System.out.println("a=" + a + ",b=" + b);
            return a + b;
        } ).get();


    }
}
