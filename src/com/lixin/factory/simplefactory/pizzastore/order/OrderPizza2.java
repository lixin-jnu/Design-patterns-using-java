package com.lixin.factory.simplefactory.pizzastore.order;

import java.io.*;
import com.lixin.factory.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizza2 {

    Pizza pizza = null;
    String orderType = "";//用户输入的

    //构造器
    public OrderPizza2() {
        do {
            orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType);
            if (pizza != null) {//订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购披萨失败!");
                break;
            }
        } while (true);
    }

    //写一个方法,可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入订购Pizza的种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
