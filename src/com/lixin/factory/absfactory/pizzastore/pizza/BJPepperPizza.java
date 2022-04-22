package com.lixin.factory.absfactory.pizzastore.pizza;

public class BJPepperPizza extends Pizza {

	@Override
	public void prepare() {
		setName("北京的胡椒披萨");
		System.out.println("北京的胡椒披萨准备原材料~");
	}

}
