package com.lixin.factory.factorymethod.pizzastore.order;

public class PizzaStore {

    public static void main(String[] args) {
        String loc = "ld";
        if (loc.equals("bj")) {
            //����������ζ�ĸ���Pizza
            new BJOrderPizza();
        } else {
            //�����׶ؿ�ζ�ĸ���Pizza
            new LDOrderPizza();
        }
    }

}
