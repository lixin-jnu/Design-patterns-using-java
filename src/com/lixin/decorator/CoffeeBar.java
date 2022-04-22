package com.lixin.decorator;

public class CoffeeBar {

    public static void main(String[] args) {
        /*
         * 装饰者模式下的订单:2份巧克力+1份牛奶的LongBlack咖啡
         */
        //1.点一份LongBlack咖啡
        Drink order = new LongBlack();
        //2.order加入1份牛奶
        order = new Milk(order);
        //3.order加入1份巧克力
        order = new Chocolate(order);
        //4.order再加入1份巧克力
        order = new Chocolate(order);
        System.out.println(order.cost());
        System.out.println(order.getDes());
        System.out.println("===========================");
        Drink order2 = new DeCaf();
        order2 = new Milk(order2);
        System.out.println(order2.cost());
        System.out.println(order2.getDes());
    }

}