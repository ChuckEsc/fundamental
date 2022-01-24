package com.zh.algorithms;

import java.util.Arrays;
import java.util.List;

public class BestTime2Sell {
    public static void main(String[] args) {

//        List<Integer> integers = Arrays.asList(8, 9, 2, 5, 4, 7, 1);
        int[] prices = {8, 9, 2, 5, 4, 7, 1};
        int answer = solution(prices);
        System.out.println("answer = " + answer);
    }


    static int solution(int[] prices) {
        int[] profits = new int[prices.length - 1];
        for (int i = 1; i < prices.length; i++) {
            profits[i - 1] = prices[i] - prices[i - 1]; //遍历整个数组，将利润存放在容器当中
        }
        int max = -1; //设置最大值
        int sum = -1;

        for (int i = 0; i < profits.length; i++) {
            if (sum > 0) {
                sum += profits[i];
            } else {
                sum = profits[i];
            }

            if (sum > max) {
                max = sum;
            }
        }
        return Math.max(max, 0);
    }
}
