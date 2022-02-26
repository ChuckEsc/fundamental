package com.zh.standard;

/**
 * @author yunfeng
 */
public class ComplicatedStatements {
    public static void main(String[] args) {
        // Do not use complicated statements in conditional statements.
        boolean flag = (args.length > 0) && (args[0].length() != 0) && (args[0].getClass() == String.class);
        if (flag) {
            System.out.println();
        }
        // Do: extracted those complicated statements to a variable in advance

    }
}
