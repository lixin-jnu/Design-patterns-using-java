package com.lixin.strategy.improve;

public abstract class Duck {

    //飞翔策略接口
    FlyBehavior flyBehavior;
    //叫策略接口
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();//显示鸭子信息

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