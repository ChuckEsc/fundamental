package com.interview.threads.local;

import javax.swing.*;
import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class LocalLambda {

    public final static ThreadLocal<DateFormatter> formatter1 = ThreadLocal.withInitial(() -> new DateFormatter(new SimpleDateFormat("dd-MMM-yyyy")));

    public static void main(String[] args) {
        //
        ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 42);
        // thread unsafe
        DateFormatter formatter = new DateFormatter();
        // lambda 构造函数 实现线程安全
        Runnable runnable = () -> System.out.println("hello, world");
        JButton button = new JButton();
        button.addActionListener(event -> System.out.println(event.getActionCommand()));

    }
}
