package com.lixin.state;

/*
 * ���Ž�Ʒ״̬
 */
public class DispenseState extends State {

    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("���Ѿ��۳���������~");
    }

    @Override
    public boolean raffle() {
        System.out.println("�����н���~");
        return false;
    }

    //���Ž�Ʒ
    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0) {
            System.out.println("��ϲ�н�,�������Ľ�Ʒmua~");
            //�ı�״̬ΪNoRaffleState
            activity.setState(activity.getNoRaffleState());
        } else {
            System.out.println("���ź�,��Ʒ������wu-wu");
            //�ı�״̬ΪDispenseOutState,�������ǾͲ������ٳ齱��
            activity.setState(activity.getDispenseOutState());
            System.out.println("�齱�����~");
            System.exit(0);
        }
    }

}