package com.lixin.strategy.improve;

public abstract class Duck {

    //������Խӿ�
    FlyBehavior flyBehavior;
    //�в��Խӿ�
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();//��ʾѼ����Ϣ

    public void quack() {
    	if (quackBehavior != null) {
    		quackBehavior.quack();
		}
    }

    public void fly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }


	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

}