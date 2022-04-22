package com.lixin.state;

import java.util.Random;

/*
 * ���Գ齱״̬
 */
public class CanRaffleState extends State {

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    //�Ѿ��۳�����
    @Override
    public void deductMoney() {
        System.out.println("���Ѿ���ȡ��������~");
    }

    //���Գ齱,���꽱��,����ʵ�����->�µ�״̬
    @Override
    public boolean raffle() {
        System.out.println("���ڳ齱,���Ե�!");
        Random r = new Random();
        int num = r.nextInt(10);
        //10%�н�����
        if (num == 0) {
            //�ı�״̬ΪDispenseState
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            System.out.println("���ź���û�г��н�Ʒ!!!!!!!!!!!");
            //�ı�״̬ΪNoRaffleState
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    //���ܷ��Ž�Ʒ
    @Override
    public void dispensePrize() {
        System.out.println("���ڳ齱��ɺ�,���ݳ齱����һ���Ӧ�Ľ�Ʒou");
    }

}