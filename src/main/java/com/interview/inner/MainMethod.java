package com.interview.inner;

public class MainMethod {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.herThere();

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();

    }
}
