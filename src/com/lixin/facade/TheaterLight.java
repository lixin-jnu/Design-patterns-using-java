package com.lixin.facade;

public class TheaterLight {

    private static final TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("�򿪵ƹ�");
    }

    public void off() {
        System.out.println("�رյƹ�");
    }

    public void dim() {
        System.out.println("�����ƹ�");
    }

    public void bright() {
        System.out.println("�����ƹ�");
    }

}