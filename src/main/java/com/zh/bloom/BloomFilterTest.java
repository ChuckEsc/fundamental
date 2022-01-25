package com.zh.bloom;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
//import org.redisson.config.Config;


/**
 * 布隆过滤器测试代码
 */
public class BloomFilterTest {

    /**
     * 预计插入的数据
     */
    private static Integer expectedInsertions = 10000000;
    /**
     * 误判率
     */
    private static Double fpp = 0.01;
    /**
     * 布隆过滤器
     */
    private static BloomFilter<Integer> bloomFilter = BloomFilter.create(Funnels.integerFunnel(), expectedInsertions, fpp);

    public static void main(String[] args) {
        // 插入 1千万数据
        for (int i = 0; i < expectedInsertions; i++) {
            bloomFilter.put(i);
        }

        // 用1千万数据测试误判率
        int count = 0;
        for (int i = expectedInsertions; i < expectedInsertions *2; i++) {
            if (bloomFilter.mightContain(i)) {
                count++;
            }
        }
        System.out.println("一共误判了：" + count);


    }
}
