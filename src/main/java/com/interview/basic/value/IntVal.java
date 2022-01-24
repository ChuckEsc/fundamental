package com.interview.basic.value;

public class IntVal {
    public static void main(String[] args) {

        String orderStatus1 = new String("1");
        String orderStatus2 = new String("1");
        // true
        System.out.println(Integer.valueOf(orderStatus1) == Integer.valueOf(orderStatus2));

        Integer integer = new Integer(1);
        Integer integer1 = new Integer(1);
        // false
        System.out.println("integer == integer1 = " + (integer == integer1));
        // true
        System.out.println("integer.equals(integer1) = " + integer.equals(integer1));

        Integer one = 1;
        Integer two = 1;
        System.out.println("one == two = " + (one == two));
    }
}
