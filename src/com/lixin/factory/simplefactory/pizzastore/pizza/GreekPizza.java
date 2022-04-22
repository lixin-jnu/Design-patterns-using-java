package com.lixin.factory.simplefactory.pizzastore.pizza;

//希腊披萨
public class GreekPizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("给希腊披萨准备原材料!");
	}

}
