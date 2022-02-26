package com.zh.errors;

/**
 * @author yunfeng
 */
public class ThrowableSimulator {
    public static void main(String[] args) {
        try {
            int pants = Integer.parseInt("pants");
            System.out.println("pants = " + pants);
            System.out.printf("%s", pants);
            parseInt();
            // int pants = Integer.parseInt("pants");
        }catch (NumberFormatException exception){
            System.out.println("you can't make an int out of this");
        }finally {
            System.out.println("finally block here");
        }

    }

    static void parseInt() throws NumberFormatException{
        try {
            int pants = Integer.parseInt("pants");
        }catch (NumberFormatException exception){
            System.out.println("you can't make an int out of this");
        }finally {
            System.out.println("finally block here");
        }
    }
}
