package com.lixin.mediator.smarthouse;

public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name, this);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.getMediator().GetMessage(stateChange, getName());
    }

    public void StartTv() {
        System.out.println("StartTv!");
    }

    public void StopTv(int stateChange) {
        System.out.println("StopTv!");
        //1�ǹر�
        SendMessage(stateChange);
    }

    public void PauseTv() {
        System.out.println("PauseTv!");
    }

}