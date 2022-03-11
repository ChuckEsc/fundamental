package com.zh.maniuplate;

import java.math.BigDecimal;

/**
 * @author yunfeng
 * @date 2022/3/7
 */

public class Money {
    public static void main(String[] args) {
        BigDecimal expense = new BigDecimal("2300.12");
        boolean flag = expense.compareTo(new BigDecimal("3000")) > 0;
        System.out.println("flag = " + flag);
    }
}
