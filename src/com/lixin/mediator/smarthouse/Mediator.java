package com.lixin.mediator.smarthouse;

public abstract class Mediator {

    //在中介者对象中,将同事类对象加入到HashMap集合中
    public abstract void Register(String colleagueName, Colleague colleague);

    //接收消息,由具体的同事类对象发出,stateChange是对所要进行的动作的标识
    public abstract void GetMessage(int stateChange, String colleagueName);

}