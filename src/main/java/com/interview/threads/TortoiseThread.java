package com.interview.threads;

public class TortoiseThread extends Thread{
    
    public double distance;

    public TortoiseThread(double distance) {
        this.distance = distance;
    }
    public TortoiseThread(String str){
        super(str);
    }

    @Override
    public void run() {
        super.run();
        distance = 0.0;
        for (int i = 0; i < 10; i++) {
            distance += 10.0;
            System.out.println("乌龟跑了 "+distance + "m");
            try {
                sleep((long) (Math.random() * 1000));
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("乌龟跑到了终点...");
    }
}
