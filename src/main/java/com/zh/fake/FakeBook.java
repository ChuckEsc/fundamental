package com.zh.fake;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class FakeBook {
    public static void main(String[] args) {
        Faker faker = new Faker(Locale.CHINA);
        ArrayList<Map> maps = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            HashMap<String, String> bookMap = new HashMap<>();
            bookMap.put("author",faker.book().author());
            bookMap.put("title", faker.book().title());
            bookMap.put("genre",faker.book().genre());
            bookMap.put("publisher",faker.book().publisher());
            maps.add(bookMap);
        }
        maps.stream().forEach(System.out::println);
    }
}
