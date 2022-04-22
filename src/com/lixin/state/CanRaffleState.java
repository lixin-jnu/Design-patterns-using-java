package com.lixin.state;

import java.util.Random;

/*
 * 可以抽奖状态
 */
public class CanRaffleState extends State {

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    //已经扣除积分
    @Override
    public void deductMoney() {
        System.out.println("您已经扣取过积分了~");
    }

    //可以抽奖,抽完奖后,根据实际情况->新的状态
    @Override
    public boolean raffle() {
        System.out.println("正在抽奖,请稍等!");
        Random r = new Random();
        int num = r.nextInt(10);
        //10%中奖机会
        if (num == 0) {
            //改变状态为DispenseState
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            System.out.println("很遗憾您没有抽中奖品!!!!!!!!!!!");
            //改变状态为NoRaffleState
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    //不能发放奖品
    @Override
    public void dispensePrize() {
        System.out.println("请在抽奖完成后,根据抽奖结果兑换相应的奖品ou");
    }

}