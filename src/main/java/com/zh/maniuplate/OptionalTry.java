package com.zh.maniuplate;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.IntConsumer;

public class OptionalTry {
    private static Object IntConsumer;

    public static void main(String[] args) {
//        getTwo();
//        getDate();
        dateList();
    }

    static void dateList(){
        LocalDate localDate = LocalDate.parse("2021-10-09");
        List<LocalDate> localDates = Arrays.asList(
                localDate,
                localDate.plusDays(12),
                localDate.minusDays(8),
                localDate.minusYears(2).minusDays(4)
        );
        System.out.println("localDates = " + localDates);
        localDates.stream().max(Comparator.comparing(LocalDate::toEpochDay)).ifPresent(date -> System.out.println(date));
    }

    static void getDate(){
//        LocalDate localDate = new LocalDate(2021,10,25);
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);
        // 根据年月日取日期：
        LocalDate today = LocalDate.of(2021, 10, 28);
        System.out.println("today = " + today);
        LocalDate endOfFeb = LocalDate.parse("2014-02-28"); // 严格按照ISO yyyy-MM-dd验证，02写成2都不行，当然也有一个重载方法允许自己定义格式
        System.out.println("endOfFeb = " + endOfFeb);

    }

    static void getTwo() {
        Integer value1 = null;
        Integer value2 = 10;
        // Optional.ofNullable - 允许传递为 null 参数
        Optional<Integer> a = Optional.ofNullable(value1);
        // Optional.of - 如果传递的参数是 null，抛出异常 NullPointerException
        Optional<Integer> b = Optional.of(value2);

        System.out.println("b.get() = " + b.get());
        System.out.println("a.isPresent() = " + a.isPresent());
        System.out.println("a.orElse(0) = " + a.orElse(0));
//        a.ifPresent();


    }
}
