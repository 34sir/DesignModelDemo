package com.example.ckc.designmodeldemo.builder;

/**
 * Created by ckc on 18-6-19.
 */

public class Test {
    public static void main(String [] args){
        Person person=new Person.Builder().setName("34sir").setSex(1).build();
        System.out.println("person::name="+person.getName()+"---person::sex="+person.getSex());
    }
}
