package com.zh.bloom;

import org.redisson.Redisson;
import org.redisson.api.RBloomFilter;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

/**
 *  *      Java集成Redis使用布隆过滤器防止缓存穿透方案
 */
public class RedisBloomFilterTest {
    /** 预计插入的数据 */
    private static Integer expectedInsertions = 10000;
    /** 误判率 */
    private static Double fpp = 0.01;

    public static void main(String[] args) {
        // Redis连接配置，无密码
        Config config = new Config();
        config.useSingleServer().setAddress("redis://127.0.0.1:6379");
        // config.useSingleServer().setPassword("123456");

        // 初始化布隆过滤器
        RedissonClient redissonClient = Redisson.create();
        RBloomFilter<Object> bloomFilter = redissonClient.getBloomFilter("filter");
        bloomFilter.tryInit(expectedInsertions, fpp);

        // 布隆过滤器增加元素
        for (Integer i = 0; i < expectedInsertions; i++) {
            bloomFilter.add(i);
        }

        // 统计元素
        int count = 0;
        for (int i = expectedInsertions; i < expectedInsertions*2; i++) {
            if (bloomFilter.contains(i)) {
                count++;
            }
        }
        System.out.println("误判次数" + count);

    }
}
