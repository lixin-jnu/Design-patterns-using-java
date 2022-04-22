package com.lixin.facade;

public class HomeTheaterFacade {

    //定义各个子系统对象
    private TheaterLight theaterLight;
    private Popcorn popcorn;
    private Screen screen;
    private DVDPlayer dVDPlayer;

    //构造器
    public HomeTheaterFacade() {
        this.theaterLight = TheaterLight.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.screen = Screen.getInstance();
        this.dVDPlayer = DVDPlayer.getInstance();
    }

    //操作分成4步
    public void ready() {
		System.out.println("####准备阶段####");
        popcorn.on();
        popcorn.pop();
        screen.down();
        dVDPlayer.on();
        theaterLight.on();
        theaterLight.dim();
		System.out.println("###############");
    }

    public void play() {
		System.out.println("####播放阶段####");
        dVDPlayer.play();
		System.out.println("###############");
    }

    public void pause() {
		System.out.println("####暂停阶段####");
        dVDPlayer.pause();
		System.out.println("###############");
    }

    public void end() {
		System.out.println("####收尾阶段####");
        popcorn.off();
        dVDPlayer.off();
        screen.up();
        theaterLight.bright();
		theaterLight.off();
		System.out.println("###############");
    }

}