package com.example.ckc.designmodeldemo.factory.commonfactory;

/**
 * Created by ckc on 18-6-19.
 */
//奥迪Q3
public class AodiQ3 extends CarProduct {

    @Override
    public void born() {
        System.out.println(this.getClass().getSimpleName()+"诞生了！");
    }
}
