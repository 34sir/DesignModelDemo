package com.example.ckc.designmodeldemo.proxy;

import com.example.ckc.designmodeldemo.proxy.dynamic.DynamicProxySubject;
import com.example.ckc.designmodeldemo.proxy.statis.ProxySubject;
import com.example.ckc.designmodeldemo.proxy.statis.RealSubject;
import com.example.ckc.designmodeldemo.proxy.statis.Subject;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        //静态代理
        ProxySubject proxy=new ProxySubject(new RealSubject());
        proxy.visit();

        //动态代理
        Subject subject=new RealSubject();
        DynamicProxySubject dynamicProxySubject=new DynamicProxySubject(subject);
        ClassLoader loader=subject.getClass().getClassLoader();
        //Proxy.newProxyInstance 此方法是实现动态代理的关键
        Subject subjecter= (Subject) Proxy.newProxyInstance(loader,new Class[]{Subject.class},dynamicProxySubject);
        subjecter.visit();
    }
}
