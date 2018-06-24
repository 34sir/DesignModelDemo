package com.example.ckc.designmodeldemo.proxy.statis;

//真实主题
public class RealSubject implements Subject{
    @Override
    public void visit() {
        System.out.println("具体主题 具体逻辑");
    }
}
