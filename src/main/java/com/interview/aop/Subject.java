package com.interview.aop;

public interface Subject {
    void buy();
}

class RealSubject implements Subject {
    @Override
    public void buy() {
        System.out.println("buying....");
    }
}

class StaticProxy implements Subject {

    private Subject subject;

    public StaticProxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void buy() {
        subject.buy(); // 静态代理
    }
}

class TestProxy{
    public static void main(String[] args) {
        StaticProxy staticProxy = new StaticProxy(new RealSubject());
        staticProxy.buy();
    }
}