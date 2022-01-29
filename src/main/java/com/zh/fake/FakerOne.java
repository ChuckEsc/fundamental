package com.zh.fake;

import com.github.javafaker.Faker;

public class FakerOne {
    private static Faker faker;

    private FakerOne() {}

    public static Faker getInstance() {
        if (faker == null) {
            synchronized (FakerOne.class) {
                faker = new Faker();
            }
        }
        return faker;
    }
}
