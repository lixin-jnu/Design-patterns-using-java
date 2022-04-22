package com.lixin.factory.simplefactory.pizzastore.order;

import com.lixin.factory.simplefactory.pizzastore.pizza.*;

//�򵥹�����
public class SimpleFactory {

	//����orderType���ض�Ӧ��Pizza����
	public Pizza createPizza(String orderType) {
		Pizza pizza = null;
		//System.out.println("ʹ�ü򵥹���ģʽ1~~");
		if (orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName("ϣ������");
		} else if (orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName("��������");
		} else if (orderType.equals("pepper")) {
			pizza = new PepperPizza();
			pizza.setName("��������");
		}
		return pizza;
	}
	
	//�򵥹���ģʽҲ�о�̬����ģʽ
	public static Pizza createPizza2(String orderType) {
		Pizza pizza = null;
		//System.out.println("ʹ�ü򵥹���ģʽ2~~");
		if (orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName(" ϣ������ ");
		} else if (orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName(" �������� ");
		} else if (orderType.equals("pepper")) {
			pizza = new PepperPizza();
			pizza.setName("��������");
		}
		return pizza;
	}

}