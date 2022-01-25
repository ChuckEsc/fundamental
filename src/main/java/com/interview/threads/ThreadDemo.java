package com.interview.threads;

public class ThreadDemo {
    public static void main(String[] args) {
        RabbitThread rabbitThread = new RabbitThread("兔子");
        TortoiseThread tortoiseThread = new TortoiseThread("乌龟");
        rabbitThread.start();
        tortoiseThread.start();

    }
}
