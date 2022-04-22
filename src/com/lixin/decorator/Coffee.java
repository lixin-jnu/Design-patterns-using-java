package com.lixin.decorator;

//单品咖啡的抽象层:Coffee类
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }

}