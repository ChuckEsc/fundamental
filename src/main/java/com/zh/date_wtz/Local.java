package com.zh.date_wtz;

import java.time.LocalDate;

/**
 * @author yunfeng
 */
public class Local {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);

        LocalDate oneDay = LocalDate.of(2020, 12, 23);
        System.out.println("oneDay = " + oneDay);
    }
}
