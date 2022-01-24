package com.zh.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 约瑟夫问题
 */
public class JosephusProblem {

    static List<Integer> toDie(int total, int call){
        List<Integer> peoples = new ArrayList<>();
        for (int i = 0; i < total; i++) {
            peoples.add(i);
        }

        ArrayList<Integer> results = new ArrayList<>();
        int num = 0;

        while (peoples.size() > 1){
            num = (num+call)%peoples.size();
            results.add(peoples.remove(num));
            //从上一个位置开始计数
            num--;
        }
        return results;

    }

    public static void main(String[] args) {
        List<Integer> dying = toDie(8, 3);
        System.out.println("dying = " + dying);
    }
}
