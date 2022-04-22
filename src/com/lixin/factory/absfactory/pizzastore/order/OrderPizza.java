package com.lixin.factory.absfactory.pizzastore.order;

import java.io.*;
import com.lixin.factory.absfactory.pizzastore.pizza.Pizza;

public class OrderPizza {

    //构造器
    public OrderPizza(AbsFactory factory) {
        setFactory(factory);
    }

    private void setFactory(AbsFactory factory) {
        Pizza pizza = null;
        String orderType = "";//用户输入
        do {
            orderType = getType();
            //factory可能是北京的工厂子类,也可能是伦敦的工厂子类
            pizza = factory.createPizza(orderType);
            if (pizza != null) {//订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败!");
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
