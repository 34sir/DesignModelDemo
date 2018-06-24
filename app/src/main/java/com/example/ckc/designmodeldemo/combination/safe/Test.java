package com.example.ckc.designmodeldemo.combination.safe;

public class Test {
    public static void main(String[] args) {
        // 与透明组合模式的区别
        Composite root = new Composite("root");

        Composite branchOne = new Composite("branchone");
        Composite branchTwo = new Composite("branchtwo");

        Leaf leafOne = new Leaf("leafone");
        Leaf leafTwo = new Leaf("leaftwo");

        branchOne.addChild(leafOne);
        branchTwo.addChild(leafTwo);

        root.addChild(branchOne);
        root.addChild(branchTwo);

        root.doSomething();
    }
}
