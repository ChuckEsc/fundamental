package com.interview.collection.blocking;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;

public class Delayed {
    public static void main(String[] args) {
        DelayQueue<Stock> stocks = new DelayQueue<Stock>();
        stocks.add(new Stock());
        stocks.add(new Stock());
        try {
            long start = System.currentTimeMillis();
            Stock take = stocks.take();
            long end = System.currentTimeMillis();
            System.out.println("cost time:" + (end - start));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}

class Stock implements java.util.concurrent.Delayed {

    @Override
    public long getDelay(TimeUnit unit) {
//        return unit.convert(time - now(), TimeUnit.NANOSECONDS);
        return 1;
    }

    @Override
    public int compareTo(java.util.concurrent.Delayed o) {
        return 0;
    }
}