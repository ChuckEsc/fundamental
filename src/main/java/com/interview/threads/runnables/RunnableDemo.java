package com.interview.threads.runnables;

public class RunnableDemo {
    public static void main(String[] args) {
        RabbitRunnableImpl rabbitRunnable = new RabbitRunnableImpl();
        TortoiseRunnableImpl tortoiseRunnable = new TortoiseRunnableImpl();
        Thread rabbit = new Thread(rabbitRunnable);
        Thread tortoise = new Thread(tortoiseRunnable);

        rabbit.setPriority(Thread.MIN_PRIORITY);
        tortoise.setPriority(Thread.MAX_PRIORITY);
        rabbit.start();
        tortoise.start();
    }
}
