package com.lixin.state;

/*
 * ��Ʒ�������״̬:
 * �����ǵ�activity״̬���DispenseOutStateʱ�齱�����;
 */
public class DispenseOutState extends State {

    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("��Ʒ�������,���´β���~");
    }

    @Override
    public boolean raffle() {
        System.out.println("��Ʒ�������,���´β���~");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("��Ʒ�������,���´β���~");
    }

}