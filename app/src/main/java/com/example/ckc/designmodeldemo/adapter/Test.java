package com.example.ckc.designmodeldemo.adapter;

import com.example.ckc.designmodeldemo.adapter.kind.VoltAdapter;
import com.example.ckc.designmodeldemo.adapter.object.Volt220;

public class Test {
    public static void main(String[] args) {
        System.out.println(new VoltAdapter().getVolt5());
        System.out.println(new com.example.ckc.designmodeldemo.adapter.object.VoltAdapter(new Volt220()).getVolt220());
    }
}
