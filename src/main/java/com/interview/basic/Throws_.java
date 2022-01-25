package com.interview.basic;

public class Throws_ {
    public static void main(String[] args) {
        catch_();
    }

    static void catch_(){
        try {
            int i = 0;
            throw new NullPointerException("主动调用的空指针异常");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
