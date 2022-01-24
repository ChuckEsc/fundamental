package com.interview.threads.runnables;

public class RabbitRunnableImpl implements Runnable{

    public double distance;

    @Override
    public void run() {
        distance = 0.0;
        for (int i = 0; i < 10; i++) {
            distance += 10.0;
            System.out.println("兔子跑了 "+ distance + "m");

            try {
                Thread.sleep((long) (Math.random() * 1000));
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("兔子跑到了终点...");
    }
}
