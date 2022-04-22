package com.lixin.factory.absfactory.pizzastore.order;

public class PizzaStore {

	public static void main(String[] args) {
		//使用抽象工厂模式
		new OrderPizza(new BJFactory());
		new OrderPizza(new LDFactory());
	}

}
