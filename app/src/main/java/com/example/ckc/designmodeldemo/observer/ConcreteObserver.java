package com.example.ckc.designmodeldemo.observer;

/**
 * Created by ckc on 18-6-19.
 */

//具体观察者
public class ConcreteObserver implements Observer{
    String msg;
    @Override
    public void update(String msg) {
        this.msg = msg;
        System.out.println("ConcreteSubject的msg更新成" + this.msg);
    }
}
