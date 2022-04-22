package com.lixin.mediator.smarthouse;

//�����ͬ����
public class Alarm extends Colleague {

    //������
    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        //�ڴ���Alarmͬ�¶���ʱ,���Լ����뵽ConcreteMediator������[����]
        mediator.Register(name, this);
    }

    public void SendAlarm(int stateChange) {
    	//0�ǿ���
		System.out.println("Alarm start!");
        SendMessage(stateChange);
    }

    @Override
    public void SendMessage(int stateChange) {
        //�����н��߶����GetMessage
        this.getMediator().GetMessage(stateChange, getName());
    }

}