package com.lixin.facade;

public class HomeTheaterFacade {

    //���������ϵͳ����
    private TheaterLight theaterLight;
    private Popcorn popcorn;
    private Screen screen;
    private DVDPlayer dVDPlayer;

    //������
    public HomeTheaterFacade() {
        this.theaterLight = TheaterLight.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.screen = Screen.getInstance();
        this.dVDPlayer = DVDPlayer.getInstance();
    }

    //�����ֳ�4��
    public void ready() {
		System.out.println("####׼���׶�####");
        popcorn.on();
        popcorn.pop();
        screen.down();
        dVDPlayer.on();
        theaterLight.on();
        theaterLight.dim();
		System.out.println("###############");
    }

    public void play() {
		System.out.println("####���Ž׶�####");
        dVDPlayer.play();
		System.out.println("###############");
    }

    public void pause() {
		System.out.println("####��ͣ�׶�####");
        dVDPlayer.pause();
		System.out.println("###############");
    }

    public void end() {
		System.out.println("####��β�׶�####");
        popcorn.off();
        dVDPlayer.off();
        screen.up();
        theaterLight.bright();
		theaterLight.off();
		System.out.println("###############");
    }

}