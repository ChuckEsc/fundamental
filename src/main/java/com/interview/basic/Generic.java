package com.interview.basic;

import lombok.ToString;

@ToString
public class Generic<T> {
    private T key;
    public Generic(T key) {
        this.key = key;
    }
    public T getKey() {
        return key;
    }


    public static void main(String[] args) {
        Generic<Integer> genericInteger = new Generic<Integer>(123456);
        System.out.println("genericInteger = " + genericInteger);
    }
}


