package com.lixin.mediator.smarthouse;

//同事抽象类
public abstract class Colleague {

    private String name;
    private Mediator mediator;

	public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return mediator;
    }

	public String getName() {
		return name;
	}

	public abstract void SendMessage(int stateChange);

}