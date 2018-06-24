package com.example.ckc.designmodeldemo.adapter.object;

public class VoltAdapter extends Volt220 implements FiveVolt {
    Volt220 volt220; //与类适配器的区别 VoltAdapter相当于其代理

    public VoltAdapter(Volt220 volt220) {
        this.volt220 = volt220;
    }

    @Override
    public int getVolt5() { //将getVolt220转换为getVolt5
        return 5;
    }

    @Override
    public int getVolt220() {
        return this.volt220.getVolt220();
    }

}
