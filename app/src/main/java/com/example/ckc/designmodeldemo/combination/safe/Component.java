package com.example.ckc.designmodeldemo.combination.safe;

//抽象根节点
public abstract class Component {
    protected String name; //节点

    public Component(String name) {
        this.name = name;
    }

    //具体由子类实现
    public abstract void doSomething();
}
