package com.zh.date_wtz;

import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author: yunfeng
 * @date: 2022/2/25 4:03 PM
 */
@ToString
public class LocalInitial {
    LocalDate startDate;

    LocalDate endDate = LocalDate.now();

    BigDecimal amount = BigDecimal.ZERO;


    public static void main(String[] args) {
        LocalInitial initial = new LocalInitial();
        initial.startDate = LocalDate.of(2020, 9, 10);
//        initial.amount = BigDecimal.TEN;
        initial.amount = BigDecimal.valueOf(3.1415926);
        System.out.println("initial = " + initial);
        System.out.println("initial.amount = " + initial.amount);
    }
}

