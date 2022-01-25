package com.zh.practice;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
public class Person {
    String name;
    Boolean gender;
    Integer age;
}

class Run{
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(
                1, 3, 5
        );
        List<Person> people = Arrays.asList(
                new Person("chuck", true, 23),
                new Person("monica", false, 28)
        );
        System.err.println(people);
        // 是的，sonar推荐使用slf4j等日志框架来记录日志，不推荐使用println
        System.out.println(integers);
    }
}