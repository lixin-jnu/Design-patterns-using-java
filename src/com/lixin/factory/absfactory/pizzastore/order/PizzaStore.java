package com.lixin.factory.absfactory.pizzastore.order;

public class PizzaStore {

	public static void main(String[] args) {
		//ʹ�ó��󹤳�ģʽ
		new OrderPizza(new BJFactory());
		new OrderPizza(new LDFactory());
	}

}
