package com.example.ckc.designmodeldemo.combination.transparent;

import java.util.ArrayList;
import java.util.List;

//枝干
public class Composite extends Component {
    public Composite(String name) {
        super(name); // 调用父类的方法
    }

    private List<Component> composites = new ArrayList<>();

    @Override
    public void doSomething() {
        System.out.println(name); //此句为具体实现的逻辑
        if (null != composites) {
            for (Component c : composites) {
                c.doSomething();
            }
        }
    }

    public void addChild(Component c) {
        composites.add(c);
    }

    @Override
    public void removeChild(Component c) {
        composites.remove(c);
    }


    public Component getChild(int index) {
        return composites.get(index);
    }
}
