package com.example.ckc.designmodeldemo.interator;

//容器接口
public interface Aggregate<T> {
    void add(T obj);

    void remove(T obj);

    Iterator<T> interator();// 获取容器的迭代器
}
