package com.lixin.state;

/*
 * 抽奖活动
 */
public class RaffleActivity {

    //当前状态
    State state;
    //奖品数量
    int count;
    //四个属性->表示四种状态
    State noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    State dispenseState = new DispenseState(this);
    State dispenseOutState = new DispenseOutState(this);

    //构造器
    //1.初始化当前的状态为NoRaffleState(即不能抽奖状态);
    //2.初始化奖品的数量;
    public RaffleActivity(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }

    //扣除积分,调用当前状态的deductMoney
    public void deductMoney() {
        state.deductMoney();
    }

    //抽奖 
    public void raffle() {
        //如果当前的状态是抽奖成功
        if (state.raffle()) {
            //领取奖品
            state.dispensePrize();
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    //这里请大家注意,每领取一次奖品,count--
    public int getCount() {
        return count--;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

}