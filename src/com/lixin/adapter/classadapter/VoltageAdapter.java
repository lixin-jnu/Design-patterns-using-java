package com.lixin.adapter.classadapter;

//适配器类(继承的是被适配的类220V,实现的是目标接口5V)
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

	@Override
	public int output5V() {
		//获取到220V电压
		int srcV = output220V();
		//转成5V电压
		int dstV = srcV / 44 ;
		System.out.println("电压=" + dstV + "伏");
		return dstV;
	}

}
