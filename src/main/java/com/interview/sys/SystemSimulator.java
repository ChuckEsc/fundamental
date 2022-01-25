package com.interview.sys;

import java.io.Console;

public class SystemSimulator {
    public static void main(String[] args) {
        String property = System.getProperty("os.name");
        System.out.println("property = " + property); //  Mac OS X

        Console console = System.console();
//        console.printf("%s p", property);
        double two_pow_eight = Math.pow(2, 8);
        double eight_pow_ = Math.pow(8, 2);
        String s = String.valueOf(two_pow_eight);
        String s1 = String.valueOf(eight_pow_);
        System.out.println("s.length() = " + s.length());
        System.out.println("s1.length() = " + s1.length());
    }
}
