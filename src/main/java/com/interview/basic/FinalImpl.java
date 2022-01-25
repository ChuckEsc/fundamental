package com.interview.basic;

public class FinalImpl implements MyInterface, WeInterface{
    public static void main(String[] args) {
        System.out.println(MyInterface.variant);
    }


    @Override
    public void print(String name) {

    }

    @Override
    public void print() {

    }
}

interface MyInterface{
    public static final String variant = "My Interface";

    void print(String name);
}

interface WeInterface{
    public static final String variant = "My Interface";

    void print();
}