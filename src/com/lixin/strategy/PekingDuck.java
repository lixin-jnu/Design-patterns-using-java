package com.lixin.strategy;

public class PekingDuck extends Duck {

    @Override
    public void display() {
        System.out.println("~~����Ѽ~~");
    }

    //��Ϊ����Ѽ���ܷ���,������Ҫ��дfly
    @Override
    public void fly() {
        System.out.println("����Ѽ���ܷ���");
    }

}