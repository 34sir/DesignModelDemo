package com.example.ckc.designmodeldemo.combination.transparent;

//叶子
public class Leaf extends Component {
    public Leaf(String name) {
        super(name); // 调用父类的方法
    }

    @Override
    public void doSomething() {
        System.out.println(name);
    }

    @Override
    public void addChild(Component c) {
        throw new UnsupportedOperationException("叶子无法添加子节点");
    }

    @Override
    public void removeChild(Component c) {
        throw new UnsupportedOperationException("叶子没有子节点");
    }

    @Override
    public Component getChild(int index) {
        throw new UnsupportedOperationException("叶子没有子节点");
    }
}
