package com.example.ckc.designmodeldemo.combination.transparent;

public class Test {
    public static void main(String[] args) {
        // 与安全组合模式的区别
        Component root=new Composite("root");

        Component branchOne=new Composite("branchone");
        Component branchTwo = new Composite("branchtwo");

        Component leafOne=new Leaf("leafone");
        Component leafTwo=new Leaf("leaftwo");

        branchOne.addChild(leafOne);
        branchTwo.addChild(leafTwo);

        root.addChild(branchOne);
        root.addChild(branchTwo);

        root.doSomething();
    }
}
