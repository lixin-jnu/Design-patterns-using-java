package com.lixin.factory.absfactory.pizzastore.order;

import com.lixin.factory.absfactory.pizzastore.pizza.*;

//�׶ع�������
public class LDFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		//System.out.println("~ʹ�õ��ǳ��󹤳�ģʽ~");
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}

}
