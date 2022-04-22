package com.lixin.mediator.smarthouse;

public class ClientTest {

	public static void main(String[] args) {
		//����һ���н��߶���
		Mediator mediator = new ConcreteMediator();
		//����Alarm���Ҽ��뵽ConcreteMediator�����HashMap��
		Alarm alarm = new Alarm(mediator, "alarm");
		//������CoffeeMachine�����Ҽ��뵽ConcreteMediator�����HashMap��
		CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");
		//����Curtains���Ҽ��뵽ConcreteMediator�����HashMap��
		Curtains curtains = new Curtains(mediator, "curtains");
		//����TV���Ҽ��뵽ConcreteMediator�����HashMap��
		TV tV = new TV(mediator, "tv");
		//�����ӷ�����Ϣ
		alarm.SendAlarm(0);
		System.out.println("------");
		coffeeMachine.FinishCoffee(1);
		System.out.println("------");
		tV.StopTv(1);
	}

}