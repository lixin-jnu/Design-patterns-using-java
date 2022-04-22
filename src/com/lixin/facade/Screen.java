package com.lixin.facade;

public class Screen {

    private static final Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println("фад╩иоиЩ");
    }

    public void down() {
        System.out.println("фад╩об╫╣");
    }


}
