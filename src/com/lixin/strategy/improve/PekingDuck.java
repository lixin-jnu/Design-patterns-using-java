package com.lixin.strategy.improve;

public class PekingDuck extends Duck {

	//���籱��Ѽ���Է���,���Ƿ��輼��һ��
	public PekingDuck() {
		flyBehavior = new BadFlyBehavior();
		quackBehavior = new GaGaQuackBehavior();
	}
	
	@Override
	public void display() {
		System.out.println("~~����Ѽ~~");
		quack();
		fly();
	}

}