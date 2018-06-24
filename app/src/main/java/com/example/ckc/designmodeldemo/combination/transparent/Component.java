package com.example.ckc.designmodeldemo.combination.transparent;

//抽象根节点
public abstract class Component {
    protected String name; //节点

    public Component(String name) {
        this.name = name;
    }

    //具体由子类实现
    public abstract void doSomething();

    public abstract void addChild(Component c);

    public abstract void removeChild(Component c);

    public abstract Component getChild(int index);

}
