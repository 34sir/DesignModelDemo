package com.example.ckc.designmodeldemo.decoration;

//抽象装饰者
public class Decorator extends Component {
    private Component component;//持有一个组件

    public Decorator(Component component) {
        this.component = component;
    }

    @Override

    public void operate() {
        component.operate();
    }
}
