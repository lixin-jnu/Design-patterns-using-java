package com.lixin.factory.simplefactory.pizzastore.order;

//�൱��һ���ͻ���,�ͻ��Ӵ˶���Pizza
public class PizzaStore {

	public static void main(String[] args) {
		/* 1.��ͳд�� */
		//new OrderPizza();
		/* 2.�򵥹���ģʽ */
		new OrderPizza(new SimpleFactory());
		/* 3.��̬����ģʽ */
		new OrderPizza2();
	}

}
