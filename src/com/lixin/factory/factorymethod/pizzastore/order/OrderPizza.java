package com.lixin.factory.factorymethod.pizzastore.order;

import java.io.*;
import com.lixin.factory.factorymethod.pizzastore.pizza.Pizza;

public abstract class OrderPizza {

	//定义一个抽象方法->createPizza,让各个工厂子类自己实现
	abstract Pizza createPizza(String orderType);
	
	//构造器
	public OrderPizza() {
		Pizza pizza = null;
		String orderType;//订购披萨的种类
		do {
			orderType = getType();
			pizza = createPizza(orderType);//抽象方法,由工厂子类完成
			if (pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println("披萨订购失败!");
				break;
			}
		} while (true);
	}

	//写一个方法,可以获取客户希望订购的披萨种类
	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("请输入订购披萨的种类:");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
