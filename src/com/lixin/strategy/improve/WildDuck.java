package com.lixin.strategy.improve;

public class WildDuck extends Duck {

    public WildDuck() {
    	quackBehavior = new GaGaQuackBehavior();
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("~~’‚ «“∞—º~~");
        quack();
        fly();
    }

}