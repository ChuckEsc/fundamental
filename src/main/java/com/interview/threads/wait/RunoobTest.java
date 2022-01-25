package com.interview.threads.wait;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class RunoobTest extends Object {
    private List synchedList;

    public RunoobTest() {
        synchedList = Collections.synchronizedList(new LinkedList<String>());
    }

    public String removeElement() throws InterruptedException {
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
        synchronized (synchedList) {
            while (synchedList.isEmpty()) {
                System.out.println(Thread.currentThread().getName() +" List is empty...");
                synchedList.wait(100);
                System.out.println(Thread.currentThread().getName() + " Waiting...");
            }
            String remove = (String) synchedList.remove(0);
            System.out.println(Thread.currentThread().getName() + " is returned");
            return remove;
        }
    }

    public void addElement(String element) {
        System.out.println("Opening...");
        synchronized (synchedList) {
            // 添加一个元素，并通知元素已存在
            synchedList.add(element);
            System.out.println("New Element:'" + element + "'");
            synchedList.notifyAll();
            // 被唤醒的线程将无法继续，直到当前线程放弃对该对象的锁定。
            System.out.println("notifyAll called!");
        }
        System.out.println("Closing...");

    }


    public static void main(String[] args) {
        final RunoobTest demo = new RunoobTest();

        Runnable runA = new Runnable() {
            @Override
            public void run() {
                try {
                    String item = demo.removeElement();
                    System.out.println("" + item);
                } catch (InterruptedException ix) {
                    System.out.println("Interrupted Exception!");
                } catch (Exception x) {
                    System.out.println("Exception thrown.");
                }
            }
        };

        Runnable runB = new Runnable() {

            // 执行添加元素操作，并开始循环
            public void run() {
                demo.addElement("Hello!");
            }
        };

        try {
            Thread threadA1 = new Thread(runA, "Google");
            threadA1.start();
            threadA1.setPriority(Thread.MIN_PRIORITY);

            // sleep相当于让线程睡眠，交出CPU，让CPU去执行其他的任务。
            Thread.sleep(0);

            Thread threadA2 = new Thread(runA, "Runoob");
            threadA2.start();
            threadA2.setPriority(Thread.MAX_PRIORITY);

            //但是有一点要非常注意，sleep方法不会释放锁
            Thread.sleep(0);

            Thread threadB = new Thread(runB, "Taobao");
            threadB.start();

            Thread.sleep(0);

            threadA1.interrupt();
            threadA2.interrupt();
        } catch (InterruptedException x) {
//        } catch (Exception x) {
        }
    }
}
