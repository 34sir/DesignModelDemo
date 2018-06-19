package com.example.ckc.designmodeldemo.observer;

/**
 * Created by ckc on 18-6-19.
 */

public interface Subject {
    void notifyData();
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
}
