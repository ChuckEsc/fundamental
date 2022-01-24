package com.interview.basic;

public class Private2Extend {
    public static void main(String[] args) {
        Chinese chinese = new Chinese();
        chinese.name = "华人区";
    }
}

class Person{
    String name;
    private String address;
    protected String nation;
}

class Chinese extends Person{

    public Chinese(String name,String address) {
        this.name = name;
//        this.address = address;
//        super.address = address;
        this.nation = "中国人";
    }

    public Chinese() {

    }
}