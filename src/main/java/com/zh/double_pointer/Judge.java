package com.zh.double_pointer;

public class Judge {
    public static Boolean judge(String str){
        if (str.length() == 0)
            return true;
        //两个指针，一个从左边开始，一个从右边开始，每次两个
        //指针都同时往中间挪，只要两个指针指向的字符不一样就返回false
        int length = str.length();
        int left = 0;
        int right = length - 1;
        while (left < right){
            if (str.charAt(left++) != str.charAt(right--)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String test = "abcba";
        System.out.println("judge(test) = " + judge(test));
    }
}
