package com.lixin.state;

/*
 * ���ܳ齱״̬
 */
public class NoRaffleState extends State {

    //��ʼ��ʱ����activity����,�۳����ֺ�ı���״̬
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    //��ǰ״̬���Կ۳�����,�۳���,��״̬���óɿ��Գ齱״̬
    @Override
    public void deductMoney() {
        System.out.println("�۳�50���ֳɹ�,�����Գ齱��~");
        activity.setState(activity.getCanRaffleState());
    }

    //��ǰ״̬���ܳ齱
    @Override
    public boolean raffle() {
        System.out.println("�۳����ֲſ��Գ齱Ѽ!");
        return false;
    }

    //��ǰ״̬���ܷ��Ž�Ʒ
    @Override
    public void dispensePrize() {
        System.out.println("��δ�۳����ֽ��г齱,���ܷ��Ž�Ʒgg");
    }

}