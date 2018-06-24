package com.example.ckc.designmodeldemo.interator;

//迭代器接口 主要的两个方法：hasNext  next();
public interface Iterator<T> {
    boolean hasNext();
    //泛型更具灵活性
    T next();
}
