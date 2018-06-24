package com.example.ckc.designmodeldemo.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by ckc on 18-6-19.
 * 具体观察者
 */
//具体订阅者
public class ConcreteSubject implements Subject {
    // 之所有使用Vector 是因为其线程安全
    private Vector<Observer> observers = new Vector<>();

    @Override
    public void notifyData() {
        Enumeration<Observer> enumo = observers.elements();
        while (enumo.hasMoreElements()) {
            enumo.nextElement().update("hello world");
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }
}
