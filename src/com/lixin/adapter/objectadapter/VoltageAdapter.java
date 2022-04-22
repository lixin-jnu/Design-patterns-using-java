package com.lixin.adapter.objectadapter;

//��������(ʵ��Ŀ��ӿ�5V,�ۺϱ��������220V)
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;//������ϵ-�ۺϹ�ϵ

    //ͨ��������,����һ��Voltage220V����
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (null != voltage220V) {
            int src = voltage220V.output220V();//��ȡ220V��ѹ
            System.out.println("ʹ�ö���������,��������~~");
            dst = src / 44;
            System.out.println("�������,����ĵ�ѹΪ=" + dst + "V");
        }
        return dst;
    }

}
