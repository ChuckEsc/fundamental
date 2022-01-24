package com.interview.collection.blocking;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Blocking {
    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
        blockingQueue.put(1);
        blockingQueue.put(2);
        blockingQueue.put(3);
        Integer peek = blockingQueue.peek();
        Integer poll = blockingQueue.poll();
    }
}


/** LinkedBlockingQueue是“线程安全”的队列，而LinkedList是非线程安全的。
 * 下面是“多个线程同时操作并且遍历queue”的示例
 * (01) 当queue是LinkedBlockingQueue对象时，程序能正常运行。
 * (02) 当queue是LinkedList对象时，程序会产生ConcurrentModificationException异常。
 *  @author skywang
 */
class LinkedBlockingQueueDemo1 {
    // TODO: queue是LinkedList对象时，程序会出错。
//    private static Queue<String> queue = new LinkedList<String>();
    private static final Queue<String> queue = new LinkedBlockingQueue<String>();

    public static void main(String[] args) {
        // 同时启动两个线程对queue进行操作！
        new MyThread("ta").start();
        new MyThread("tb").start();
    }

    private static void printAll() {
        String value;
        for (String s : queue) {
            value = s;
            System.out.print(value + ", ");
        }
        System.out.println();
    }

    private static class MyThread extends Thread {
        MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            int i = 0;
            while (i++ < 6) {
                // “线程名” + "-" + "序号"
                String val = Thread.currentThread().getName() + i;
                queue.add(val);
                // 通过“Iterator”遍历queue。
                printAll();
            }
        }
    }
}
