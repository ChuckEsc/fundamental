package com.zh.maniuplate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Flow;
import java.util.function.Consumer;

public class ConsumerTest {


    public static void main(String[] args) {
//        Consumer publisher = x -> System.out.println((int) x * (int) x);
//        publisher.accept(2);

//        andThen();
//        splitArray();
        eachConsumer();
    }

    static void eachConsumer() {
        List<String> strings = Arrays.asList("this", "is", "a", "list", "of", "strings");
        strings.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("s.length() = " + s.length());
            }
        });
        // 上下等价
        strings.forEach(s -> System.out.print(s.length() + ", "));
        strings.stream().sorted().forEach(System.out::println);


    }

    static void splitArray() {
        String[] array = {"大雄，男", "静香，女", "胖虎，男", "哆啦A梦，未知"};
        executeSplit(
                s -> {
                    System.out.print("姓名: " + s.split("，")[0] + ",");
                },
                s -> {
                    System.out.println("性别: " + s.split("，")[1]);
                },
                array
        );

    }

    static void executeSplit(Consumer<String> consumer1, Consumer<String> consumer2, String[] array) {
        for (String s : array) {
            consumer1.andThen(consumer2).accept(s);
        }
    }


    static void andThen() {
        Consumer<Integer> consumer1 = x -> {
            System.out.println("x = " + x);
        };
        Consumer<String> consumer2 = str -> System.out.println("str.length = " + str.length());
        Consumer<Integer> consumer3 = integer -> {
            System.out.println("integer = " + integer);
            throw new NullPointerException("throw exception test");
        };

        consumer2.accept("nothing");
        consumer1.andThen(consumer3).accept(99);

    }
}
