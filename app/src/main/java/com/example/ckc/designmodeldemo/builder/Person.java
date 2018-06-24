package com.example.ckc.designmodeldemo.builder;

/**
 * Created by ckc on 18-6-19.
 */

public class Person {
    private String name;
    private int sex;

    public Person(Builder builder){
        this.name=builder.name;
        this.sex=builder.sex;
    }

    public String getName(){
        return name;
    }

    public int getSex(){
        return sex;
    }


    static class Builder {
        //Builder需要持有和Person相同的对象
        public String name;
        public int sex;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSex(int sex) {
            this.sex = sex;
            return this;
        }

        // 之所以在build中才构建具体Person对象 应该是处于拓展考虑 比如再来一个student类Builder可以复用
        public Person build() {
            return new Person(this);
        }
    }
}
