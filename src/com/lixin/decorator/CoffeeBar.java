package com.lixin.decorator;

public class CoffeeBar {

    public static void main(String[] args) {
        /*
         * װ����ģʽ�µĶ���:2���ɿ���+1��ţ�̵�LongBlack����
         */
        //1.��һ��LongBlack����
        Drink order = new LongBlack();
        //2.order����1��ţ��
        order = new Milk(order);
        //3.order����1���ɿ���
        order = new Chocolate(order);
        //4.order�ټ���1���ɿ���
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