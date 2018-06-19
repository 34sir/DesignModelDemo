package com.example.ckc.designmodeldemo.factory;

import com.example.ckc.designmodeldemo.factory.commonfactory.CarFactory;
import com.example.ckc.designmodeldemo.factory.commonfactory.ConcreateCarFactory;
import com.example.ckc.designmodeldemo.factory.commonfactory.AodiQ3;
import com.example.ckc.designmodeldemo.factory.commonfactory.AodiQ5;

/**
 * Created by ckc on 18-6-19.
 */

public class Test {
    public static void main(String [] args){
        CarFactory factory=new ConcreateCarFactory();
        factory.createProduct(AodiQ3.class).born();
        factory.createProduct(AodiQ5.class).born();
    }
}
