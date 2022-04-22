package com.lixin.mediator.smarthouse;

//¥∞¡±¿‡
public class Curtains extends Colleague {

	public Curtains(Mediator mediator, String name) {
		super(mediator, name);
		mediator.Register(name, this);
	}

	@Override
	public void SendMessage(int stateChange) {
		this.getMediator().GetMessage(stateChange, getName());
	}

	public void UpCurtains() {
		System.out.println("I am holding Up Curtains!");
	}

	public void DownCurtains() {
		System.out.println("I am holding Down Curtains!");
	}

}