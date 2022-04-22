package com.lixin.facade;

public class DVDPlayer {

    //使用单例模式(饿汉式)
    private static final DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("DVD开启");
    }

    public void off() {
        System.out.println("DVD关闭");
    }

    public void play() {
        System.out.println("DVD正在播放");
    }

    public void pause() {
        System.out.println("DVD暂停");
    }

}