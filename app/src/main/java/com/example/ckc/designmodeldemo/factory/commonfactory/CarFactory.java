package com.example.ckc.designmodeldemo.factory.commonfactory;

/**
 * Created by ckc on 18-6-19.
 * 工厂方法
 */
//汽车抽象工厂
public abstract class CarFactory {
    public abstract <T extends CarProduct> T createProduct(Class<T> clz);
}
