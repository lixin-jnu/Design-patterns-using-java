package com.lixin.strategy.improve;

public class NoFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("�������...");
    }

}