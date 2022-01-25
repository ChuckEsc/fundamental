package com.interview.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {
    private Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用委托类对象的方法
        Object result = method.invoke(object, args);
        return result;
    }
}

class TestDynamicProxy{
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        Subject proxyInstance = (Subject) Proxy.newProxyInstance(
                Subject.class.getClassLoader(),
                realSubject.getClass().getInterfaces(), // return an array of interfaces directly implemented by this class
                new DynamicProxy(realSubject)
        );

        proxyInstance.buy();
    }
}
