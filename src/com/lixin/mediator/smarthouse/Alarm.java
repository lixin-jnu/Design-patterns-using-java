package com.lixin.mediator.smarthouse;

//具体的同事类
public class Alarm extends Colleague {

    //构造器
    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        //在创建Alarm同事对象时,将自己放入到ConcreteMediator对象中[集合]
        mediator.Register(name, this);
    }

    public void SendAlarm(int stateChange) {
    	//0是开启
		System.out.println("Alarm start!");
        SendMessage(stateChange);
    }

    @Override
    public void SendMessage(int stateChange) {
        //调用中介者对象的GetMessage
        this.getMediator().GetMessage(stateChange, getName());
    }

}