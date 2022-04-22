package com.lixin.factory.factorymethod.pizzastore.order;

import java.io.*;
import com.lixin.factory.factorymethod.pizzastore.pizza.Pizza;

public abstract class OrderPizza {

	//����һ�����󷽷�->createPizza,�ø������������Լ�ʵ��
	abstract Pizza createPizza(String orderType);
	
	//������
	public OrderPizza() {
		Pizza pizza = null;
		String orderType;//��������������
		do {
			orderType = getType();
			pizza = createPizza(orderType);//���󷽷�,�ɹ����������
			if (pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println("��������ʧ��!");
				break;
			}
		} while (true);
	}

	//дһ������,���Ի�ȡ�ͻ�ϣ����������������
	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("�����붩������������:");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
