package com.interview.threads;

public class RabbitThread extends Thread{
    public double distance;

    public RabbitThread(String str){
        // Thread(String name)
        super(str);
    }

    @Override
    public void run() {
        super.run();
        distance = 0.0;
        for (int i = 0; i < 10; i++) {
            distance += 10.0;
            System.out.println("兔子跑了 "+ distance + "m");
            try {
                sleep((long) (Math.random() * 1000));
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("兔子跑到了终点...");
    }

}
