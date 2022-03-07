package com.zh.hutu.cache;

import cn.hutool.cache.Cache;
import cn.hutool.cache.CacheUtil;

import java.util.Iterator;

/**
 * @author: yunfeng
 * @date: 2022/3/7 11:22 AM
 */

public class CacheKit {
    public static void main(String[] args) {
        //新建FIFOCache
        Cache<String,String> fifoCache = CacheUtil.newFIFOCache(3);
        fifoCache.put("move", "three steps");
        fifoCache.put("turn", "left");
        fifoCache.put("go", "forward");

        Iterator<String> iterator = fifoCache.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
