package com.lixin.facade;

public class Popcorn {

    private static final Popcorn instance = new Popcorn();

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("爆米花机开启");
    }

    public void off() {
        System.out.println("爆米花机关闭");
    }

    public void pop() {
        System.out.println("爆米花机正在制作爆米花");
    }

}