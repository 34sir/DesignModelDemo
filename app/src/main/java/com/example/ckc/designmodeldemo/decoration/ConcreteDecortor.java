package com.example.ckc.designmodeldemo.decoration;

//具体装饰类
public class ConcreteDecortor extends Decorator {
    public ConcreteDecortor(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        operateA(); //operateA和operateB增强组件的功能
        super.operate();
        operateB();
    }

    public void operateA() {

    }

    public void operateB() {

    }
}
