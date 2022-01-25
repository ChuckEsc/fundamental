package com.interview.basic;

public class OuterClass {
    int x = 10;

    static class InnerClass {
        int y = 5;
    }
}

class MyMainClass {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
//        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}
