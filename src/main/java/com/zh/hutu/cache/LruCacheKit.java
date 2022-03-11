package com.zh.hutu.cache;

import cn.hutool.cache.CacheUtil;
import cn.hutool.cache.impl.LRUCache;
import cn.hutool.core.date.DateUnit;

/**
 * @author: yunfeng
 * @date: 2022/3/7 11:59 AM
 */

public class LruCacheKit {
    public static void main(String[] args) {
        LRUCache<String, String> cache = CacheUtil.newLRUCache(3);
        cache.put("k1", "v1", DateUnit.MINUTE.getMillis() * 3);
        cache.put("k2", "v2", DateUnit.MINUTE.getMillis() * 3);
        cache.put("k3", "v3", DateUnit.MINUTE.getMillis() * 3);

        cache.get("k1");
        cache.put("key4", "value4", DateUnit.SECOND.getMillis() * 3);
        //由于缓存容量只有3，当加入第四个元素的时候，根据LRU规则，最少使用的将被移除（2被移除）
        //null
        String k2 = cache.get("k2");
        System.out.println("k2 = " + k2);
    }
}
