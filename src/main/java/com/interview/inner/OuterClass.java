package com.interview.inner;

public class OuterClass {
    int number = 23;

    public void herThere(){
        System.out.println("Hi there");
    }

    class InnerClass{
        int number = 42;

        public void print(){
            System.out.printf("This is my number , %d", number);
        }
    }

    static class InnerStaticClass {
            int number = 42;

            public void print(){
                System.out.printf("This is my number , %d", number);
            }
    }
}
