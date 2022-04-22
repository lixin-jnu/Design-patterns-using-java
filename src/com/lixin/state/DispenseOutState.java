package com.lixin.state;

/*
 * 奖品发放完毕状态:
 * 当我们的activity状态变成DispenseOutState时抽奖活动结束;
 */
public class DispenseOutState extends State {

    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("奖品发放完毕,请下次参与~");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发放完毕,请下次参与~");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发放完毕,请下次参与~");
    }

}