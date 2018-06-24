package com.example.ckc.designmodeldemo.decoration;

public class Test {
    public static void main(String[] arg) {
        Component component = new ConcreteComponent();
        //ConcreteDecortor装饰Component
        Decorator decorator = new ConcreteDecortor(component);
        decorator.operate();
    }
}
