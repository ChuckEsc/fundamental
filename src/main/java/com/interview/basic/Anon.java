package com.interview.basic;

import java.util.LinkedList;

public class Anon {
    private int out_a = 1;
    private static int STATIC_b = 2;

    private void test(final int i) {
        // 当所在的方法的形参需要被匿名内部类使用时，必须声明为 final。
        new Service() {
            public void method() {
                for (int j = 0; j < i; j++) {
                    System.out.println("匿名内部类");
                }
            }
        }.method();

        class Inner {
            int inner_c = 3;

            private void fun() {
                System.out.println(out_a);
                System.out.println(STATIC_b);
                System.out.println(inner_c);
            }
        }
        Inner inner = new Inner();
        Inner inner1 = new Inner();
        inner.fun();
        System.out.println("inner.equals(inner1) = " + inner.equals(inner1));
        System.out.println("inner == inner1 " + (inner == inner1));
    }

    public static void main(String[] args) {
        Anon anon = new Anon();
        LinkedList<Integer> integers = new LinkedList<>();
        LinkedList<Integer> integers1 = new LinkedList<>();
        System.out.println("integers.equals(integers1) = " + integers.equals(integers1));
        System.out.println("integers == integers1 = " + (integers == integers1));
//        anon.test(5);
    }
}

interface Service {
    void method();
}
