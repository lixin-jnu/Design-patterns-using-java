package com.lixin.facade;

public class TheaterLight {

    private static final TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("打开灯光");
    }

    public void off() {
        System.out.println("关闭灯光");
    }

    public void dim() {
        System.out.println("调暗灯光");
    }

    public void bright() {
        System.out.println("调亮灯光");
    }

}