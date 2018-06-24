package com.example.ckc.designmodeldemo.proxy.statis;

//代理类
public class ProxySubject implements Subject{
    RealSubject subject;

    public ProxySubject(RealSubject subject) {
        this.subject = subject;
    }

    @Override
    public void visit() {
        //调用受代理真实逻辑
        subject.visit();
    }
}
