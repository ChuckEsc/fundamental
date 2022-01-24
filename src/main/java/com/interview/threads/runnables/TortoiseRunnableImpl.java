package com.interview.threads.runnables;

public class TortoiseRunnableImpl implements Runnable{
    public double distance;

    @Override
    public void run() {
        distance = 0.0;
        for (int i = 0; i < 10; i++) {
            distance += 10.0;
            System.out.println("乌龟跑了 "+ distance + "m");

            try {
                Thread.sleep((long) (Math.random() * 1000));
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("乌龟跑到了终点...");
    }
}
