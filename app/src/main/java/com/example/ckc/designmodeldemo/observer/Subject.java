package com.example.ckc.designmodeldemo.observer;

/**
 * Created by ckc on 18-6-19.
 */
//抽象主题 订阅者
public interface Subject {
    void notifyData();
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
}
