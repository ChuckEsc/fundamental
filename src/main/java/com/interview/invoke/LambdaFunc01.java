package com.interview.invoke;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.awt.*;
import java.util.Date;
import java.util.function.BinaryOperator;

public class LambdaFunc01 {
    public static void main(String[] args) {
        BinaryOperator<Long> add = Long::sum;
        String name = "xxx";
        BinaryOperator<String> concat = (s1, s2) -> s1 + s2;
        System.out.println(concat.apply("hello,", "world"));
    }
}
