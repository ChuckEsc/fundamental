package com.interview.collection;

import java.util.HashMap;
import java.util.stream.Stream;

public class Hashable {
    public static void main(String[] args) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("str", "name");
        hashMap.put("position", "manager");
        hashMap.put("position", "manager1");
        hashMap.put(null, "null value");
        hashMap.put("null", "null value");

        hashMap.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));
    }
}
