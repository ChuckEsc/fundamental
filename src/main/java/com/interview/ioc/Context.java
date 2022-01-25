package com.interview.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Context {
    public static void main(String[] args) {
        // ApplicationContext是BeanFactory的完整超集
        ApplicationContext context = new ClassPathXmlApplicationContext();
    }
}

interface Parent {
    void print();
}

interface Child extends Parent {
    void printLine();
}

class ChildImpl implements Child {
    @Override
    public void print() {

    }

    @Override
    public void printLine() {

    }
}

abstract class Parents {

    public abstract void dosomething();

    public void say() {
        dosomething();
        System.out.println("www.chinoukin.com");
    }
}

class Children extends Parents {
    @Override
    public void dosomething() {
        System.out.println("张三来啦");
    }

    public static void main(String[] args) {
        Children c = new Children();
        c.say();
    }
}

class Kids extends Parents {
    @Override
    public void dosomething() {
        System.out.println("xx来啦");
    }

    public static void main(String[] args) {
        Kids c = new Kids();
        c.say();
    }
}

