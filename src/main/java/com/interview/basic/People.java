package com.interview.basic;

public class People {
    protected String name;

    public People(String name) {
        this.name = name;
    }
}

class Student extends People{
    private String name;

    public Student(String name, String name1) {
        // super()和this()均需放在构造方法内第一行。
        super(name);
        this.name = name1;
    }

    public void getInfo(){
        System.out.println(this.name);      //Child
        System.out.println(super.name);     //Father
    }

}

class Test{
    public static void main(String[] args) {
        Student s1 = new Student("Father","Child");
        s1.getInfo();

    }
}