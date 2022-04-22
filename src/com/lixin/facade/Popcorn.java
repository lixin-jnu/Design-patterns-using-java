package com.lixin.facade;

public class Popcorn {

    private static final Popcorn instance = new Popcorn();

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("���׻�������");
    }

    public void off() {
        System.out.println("���׻����ر�");
    }

    public void pop() {
        System.out.println("���׻��������������׻�");
    }

}