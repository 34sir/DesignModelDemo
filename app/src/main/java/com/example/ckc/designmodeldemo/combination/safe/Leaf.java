package com.example.ckc.designmodeldemo.combination.safe;

//叶子
public class Leaf extends Component {
    public Leaf(String name) {
        super(name); // 调用父类的方法
    }

    @Override
    public void doSomething() {
        System.out.println(name);
    }
}
