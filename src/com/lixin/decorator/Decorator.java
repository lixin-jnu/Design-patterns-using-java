package com.lixin.decorator;

/*
 * 继承Drink类且聚合另一个Drink对象
 */
public class Decorator extends Drink {

    //聚合进Drink,对其进行装饰
    private Drink obj;

    public Decorator(Drink obj) {//聚合
        this.obj = obj;
    }

    @Override
    public float cost() {
        //getPrice获得自己的价格
        return getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        //obj.getDes()输出被装饰者的信息
        return this.des + getPrice() + "+" + obj.getDes();
    }

}