package com.zh.algorithms;

import java.util.LinkedHashMap;
import java.util.Map;

public class LeastRecentlyUsed {
    public static void main(String[] args) {

        int cacheSize = 3;
        // 最大容量 = （缓存大小 / 负载因子）+ 1，保证不会触发自动扩容
        LinkedHashMap<String, String> cache = new LinkedHashMap<String, String>(
                (int)(cacheSize/ 0.75f) + 1, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > cacheSize;
            }
        };

        cache.put("1", "a");
        cache.put("2", "b");
        cache.put("3", "c");

        // head => "1" => "2" => "3" => null

        // put已存在的值，和get方法是一样的效果
        cache.put("1", "a");

        // head => "2" => "3" => "1" => null;

        cache.put("4", "d");

        // head => "3" => "1" => "4" => null;

        for (String key: cache.keySet()) {
            System.out.println(key);
        }
    }

}
