package com.lixin.state;

/*
 * �齱�
 */
public class RaffleActivity {

    //��ǰ״̬
    State state;
    //��Ʒ����
    int count;
    //�ĸ�����->��ʾ����״̬
    State noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    State dispenseState = new DispenseState(this);
    State dispenseOutState = new DispenseOutState(this);

    //������
    //1.��ʼ����ǰ��״̬ΪNoRaffleState(�����ܳ齱״̬);
    //2.��ʼ����Ʒ������;
    public RaffleActivity(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }

    //�۳�����,���õ�ǰ״̬��deductMoney
    public void deductMoney() {
        state.deductMoney();
    }

    //�齱 
    public void raffle() {
        //�����ǰ��״̬�ǳ齱�ɹ�
        if (state.raffle()) {
            //��ȡ��Ʒ
            state.dispensePrize();
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    //��������ע��,ÿ��ȡһ�ν�Ʒ,count--
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