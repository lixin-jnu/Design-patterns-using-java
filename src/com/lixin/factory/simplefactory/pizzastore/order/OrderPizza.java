package com.lixin.factory.simplefactory.pizzastore.order;

import java.io.*;
import com.lixin.factory.simplefactory.pizzastore.pizza.Pizza;

//����Pizza��
public class OrderPizza {

	/*
	//������
	public OrderPizza() {
		Pizza pizza = null;
		String orderType;//��������������
		do {
			orderType = getType();
			if (orderType.equals("greek")) {
				pizza = new GreekPizza();
				pizza.setName("ϣ������");
			} else if (orderType.equals("cheese")) {
				pizza = new CheesePizza();
				pizza.setName("��������");
			} else if (orderType.equals("pepper")) {
				pizza = new PepperPizza();
				pizza.setName("��������");
			} else {
				break;
			}
			//���Pizza��������
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();

		} while (true);
	}
	*/

	//����һ���򵥹�������
	SimpleFactory simpleFactory;
	Pizza pizza = null;
	String orderType = "";//�û������
	
	//������
	public OrderPizza(SimpleFactory simpleFactory) {
		this.simpleFactory = simpleFactory;//���ü򵥹�������
		do {
			orderType = getType();
			pizza = this.simpleFactory.createPizza(orderType);
			if(pizza != null) {//�����ɹ�
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
			System.out.println("�����붩��Pizza������:");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
