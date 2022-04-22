package com.lixin.template;

public class Client {

    public static void main(String[] args) {
        System.out.println("----制作红豆豆浆----");
        SoyMilk redBeanSoyMilk = new RedBeanSoyMilk();
        redBeanSoyMilk.make();
        System.out.println("----制作花生豆浆----");
        SoyMilk peanutSoyMilk = new PeanutSoyMilk();
        peanutSoyMilk.make();
    }

}