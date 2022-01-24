package com.interview.basic;

public class reverse {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("abcdefg");
        StringBuffer reverse = buffer.reverse();
        System.out.println("reverse = " + reverse);

        StringBuilder builder = new StringBuilder("abcdefg");
        System.out.println("builder.reverse() = " + builder.reverse());
    }
}
