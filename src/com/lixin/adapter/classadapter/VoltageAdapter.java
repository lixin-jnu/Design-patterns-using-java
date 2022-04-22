package com.lixin.adapter.classadapter;

//��������(�̳е��Ǳ��������220V,ʵ�ֵ���Ŀ��ӿ�5V)
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

	@Override
	public int output5V() {
		//��ȡ��220V��ѹ
		int srcV = output220V();
		//ת��5V��ѹ
		int dstV = srcV / 44 ;
		System.out.println("��ѹ=" + dstV + "��");
		return dstV;
	}

}
