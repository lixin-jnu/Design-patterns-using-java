package com.lixin.facade;

public class DVDPlayer {

    //ʹ�õ���ģʽ(����ʽ)
    private static final DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("DVD����");
    }

    public void off() {
        System.out.println("DVD�ر�");
    }

    public void play() {
        System.out.println("DVD���ڲ���");
    }

    public void pause() {
        System.out.println("DVD��ͣ");
    }

}