package com.lixin.factory.simplefactory.pizzastore.order;

//相当于一个客户端,客户从此订购Pizza
public class PizzaStore {

	public static void main(String[] args) {
		/* 1.传统写法 */
		//new OrderPizza();
		/* 2.简单工厂模式 */
		new OrderPizza(new SimpleFactory());
		/* 3.静态工厂模式 */
		new OrderPizza2();
	}

}
