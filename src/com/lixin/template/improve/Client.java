package com.lixin.template.improve;

public class Client {

	public static void main(String[] args) {
		System.out.println("----�����춹����----");
		SoyMilk redBeanSoyMilk = new RedBeanSoyMilk();
		redBeanSoyMilk.make();
		System.out.println("----������������----");
		SoyMilk peanutSoyMilk = new PeanutSoyMilk();
		peanutSoyMilk.make();
		System.out.println("----����������----");
		SoyMilk pureSoyMilk = new PureSoyMilk();
		pureSoyMilk.make();
	}

}