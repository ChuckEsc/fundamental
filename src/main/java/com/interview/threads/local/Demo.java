package com.interview.threads.local;

import java.util.ArrayList;

public class Demo {
    public static ThreadLocal<Integer> threadLocal;

    public static void main(String[] args) throws InterruptedException {
        threadLocal = new ThreadLocal<Integer>(){
            /**
             * 通过重写该方法来初始化ThreadLocal的值
             */
            @Override
            protected Integer initialValue() {
                return 10;
            }
        };

        MyThread t1 = new MyThread(20);
        MyThread t2 = new MyThread(30);
        t1.start();
        t1.join();
        t2.start();

    }
}



class MyThread extends Thread{
    private int val;

    public MyThread(int val) {
        this.val = val;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread() + "-BEFORE-" + Demo.threadLocal.get());
        Demo.threadLocal.set(val);
        System.out.println(Thread.currentThread() + "-AFTER-" + Demo.threadLocal.get());

    }
}
