package com.lixin.adapter.objectadapter;

//适配器类(实现目标接口5V,聚合被适配的类220V)
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;//关联关系-聚合关系

    //通过构造器,传入一个Voltage220V对象
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (null != voltage220V) {
            int src = voltage220V.output220V();//获取220V电压
            System.out.println("使用对象适配器,进行适配~~");
            dst = src / 44;
            System.out.println("适配完成,输出的电压为=" + dst + "V");
        }
        return dst;
    }

}
