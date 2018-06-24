package com.example.ckc.designmodeldemo.interator;

public class Test {
    public static void main(String[] args) {
        //此例实际实现了对容器对迭代 实际上Iterator已经存在
        Aggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.add("ckc");
        aggregate.add("34sir");

        Iterator<String> iterator = aggregate.interator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
