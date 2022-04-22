package com.lixin.state;

/*
 * 发放奖品状态
 */
public class DispenseState extends State {

    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("您已经扣除过积分了~");
    }

    @Override
    public boolean raffle() {
        System.out.println("您已中奖了~");
        return false;
    }

    //发放奖品
    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0) {
            System.out.println("恭喜中奖,这是您的奖品mua~");
            //改变状态为NoRaffleState
            activity.setState(activity.getNoRaffleState());
        } else {
            System.out.println("很遗憾,奖品发完了wu-wu");
            //改变状态为DispenseOutState,后面我们就不可以再抽奖了
            activity.setState(activity.getDispenseOutState());
            System.out.println("抽奖活动结束~");
            System.exit(0);
        }
    }

}