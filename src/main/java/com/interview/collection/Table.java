package com.interview.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class Table {
    public static void main(String[] args) {
        HashMap<String, Object> hashMap = new HashMap<>();
        Hashtable<String, Object> hashtable = new Hashtable<>();
        ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
//        concurrentHashMap.put(null,null); // 会抛出空指针
        String a = "a";
        String intern = a.intern();

        HashMap<String, Object> clone = hashMap;
        System.out.println("clone.equals(hashMap) = " + clone.equals(hashMap)); // true
        System.out.println("clone == hashMap = " + (clone == hashMap)); // true
        clone.put("news","breaking");
        HashMap<String, Object> deepCopy = new HashMap<>(hashMap);
        System.out.println("( deepCopy == hashMap ) = " + (deepCopy == hashMap));// false
        System.out.println("deepCopy.equals(hashMap) = " + deepCopy.equals(hashMap)); // true
        deepCopy.put("new","one");

    }
}
