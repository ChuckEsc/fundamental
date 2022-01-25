package com.interview.functional;

import com.google.common.collect.ImmutableMap;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConsumerAndRunnable {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        integers.forEach(System.out::println);
//        integers.forEach((it) -> System.out.println(it));
        acceptRunnable(() -> System.out.println("nothing"));

        acceptSupplier(() -> 1);

        acceptConsumer((it) -> {
        });
    }

    static void acceptRunnable(Runnable runnable) {
        // Runnable的表现形式为即没有参数也没有返回值
        runnable.run();
    }

    static void acceptSupplier(Supplier<Integer> supplier) {
        // Supplier的表现形式为不接受参数、只返回数据
        supplier.get();
    }

    static void acceptConsumer(Consumer<String> consumer) {
        // Consumer消费型函数和Supplier刚好相反。Consumer接收一个参数，没有返回值
        Objects.requireNonNull(consumer);
        consumer.accept("this");
    }
}

class FunctionMap {

    public static void main(String[] args) {
        FunctionMap functionMap = new FunctionMap();
        functionMap.method();
    }


    //调用
    public void method() {
        int num = 2;
        Person person = new Person();
        person.setName("Villein");
        person.setAge(23);
        String desc = PERSON_TYPE_MAP.get(num).apply(person);
        System.out.println("desc = " + desc);
    }


    //定义一个map跟Function组合使用的map
    private final ImmutableMap<Integer, Function<Person, String>> PERSON_TYPE_MAP = ImmutableMap.<Integer, Function<Person, String>>builder()
            .put(1, person -> String.format("我要这么展示,name:%s", person.getName()))
            .put(2, person -> String.format("我要这么展示,name:,age:%s", person.getName(), person.getAge())).build();


}

class Person {
    String name;
    Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
