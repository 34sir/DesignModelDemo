package com.example.ckc.designmodeldemo.adapter.kind;

public class VoltAdapter extends Volt220 implements FiveVolt {
    @Override
    public int getVolt5() { //将getVolt220转换为getVolt5
        return 5;
    }
}
