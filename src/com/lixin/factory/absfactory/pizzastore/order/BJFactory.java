package com.lixin.factory.absfactory.pizzastore.order;

import com.lixin.factory.absfactory.pizzastore.pizza.*;

//������������
public class BJFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		//System.out.println("~ʹ�õ��ǳ��󹤳�ģʽ~");
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new BJPepperPizza();
		}
		return pizza;
	}

}
