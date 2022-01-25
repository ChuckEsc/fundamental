package com.interview.threads.local;

import java.util.ArrayList;
import java.util.LinkedList;

public class ThreadDemo {
    public static LinkedList<Integer> arrayList;

    public static void main(String[] args) throws InterruptedException {
        arrayList = new LinkedList<>();

        MyAnotherThread t1 = new MyAnotherThread(20);
        MyAnotherThread t2 = new MyAnotherThread(30);
        t1.start();
        t1.join();
        t2.start();

    }
}

class MyAnotherThread extends Thread{
    private int val;

    public MyAnotherThread(int val) {
        this.val = val;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread() + "-BEFORE-" + ThreadDemo.arrayList.size());
        ThreadDemo.arrayList.add(val);
        System.out.println(Thread.currentThread() + "-AFTER-" + ThreadDemo.arrayList.size());

    }
}
