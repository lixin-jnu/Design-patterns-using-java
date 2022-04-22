package com.lixin.decorator;

//具体的Decorator,这里就是调味品
public class Chocolate extends Decorator {

    public Chocolate(Drink obj) {
        super(obj);
        setDes("巧克力");
        setPrice(2.5f);//调味品的价格
    }

}