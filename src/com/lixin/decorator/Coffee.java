package com.lixin.decorator;

//��Ʒ���ȵĳ����:Coffee��
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }

}