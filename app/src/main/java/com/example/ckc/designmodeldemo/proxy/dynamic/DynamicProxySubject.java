package com.example.ckc.designmodeldemo.proxy.dynamic;

import com.example.ckc.designmodeldemo.proxy.statis.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//动态代理类
public class DynamicProxySubject implements InvocationHandler{
    Subject subject;

    public DynamicProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        return method.invoke(subject,objects);
    }
}
