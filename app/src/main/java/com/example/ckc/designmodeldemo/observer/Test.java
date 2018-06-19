package com.example.ckc.designmodeldemo.observer;

/**
 * Created by ckc on 18-6-19.
 */

public class Test {
    public static void main(String [] args){
        Subject subject=new ConcreteSubject();
        subject.addObserver(new ConcreteObserver());
        subject.notifyData();
    }
}
