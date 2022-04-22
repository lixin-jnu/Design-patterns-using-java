package com.lixin.factory.simplefactory.pizzastore.pizza;

//奶酪披萨
public class CheesePizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("给奶酪披萨准备原材料!");
	}

}
