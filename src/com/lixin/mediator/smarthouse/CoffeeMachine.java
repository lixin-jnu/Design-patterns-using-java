package com.lixin.mediator.smarthouse;

public class CoffeeMachine extends Colleague {

    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name, this);
    }

    public void StartCoffee() {
        System.out.println("It's time to start coffee!");
    }

	public void FinishCoffee(int stateChange) {
		System.out.println("After 5 minutes!");
		System.out.println("Coffee is ok!");
		//1ÊÇ¹Ø±Õ
		SendMessage(stateChange);
	}

	@Override
	public void SendMessage(int stateChange) {
		this.getMediator().GetMessage(stateChange, getName());
	}

}