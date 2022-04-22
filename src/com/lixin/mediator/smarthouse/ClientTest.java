package com.lixin.mediator.smarthouse;

public class ClientTest {

	public static void main(String[] args) {
		//创建一个中介者对象
		Mediator mediator = new ConcreteMediator();
		//创建Alarm并且加入到ConcreteMediator对象的HashMap中
		Alarm alarm = new Alarm(mediator, "alarm");
		//创建了CoffeeMachine对象并且加入到ConcreteMediator对象的HashMap中
		CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");
		//创建Curtains并且加入到ConcreteMediator对象的HashMap中
		Curtains curtains = new Curtains(mediator, "curtains");
		//创建TV并且加入到ConcreteMediator对象的HashMap中
		TV tV = new TV(mediator, "tv");
		//让闹钟发出消息
		alarm.SendAlarm(0);
		System.out.println("------");
		coffeeMachine.FinishCoffee(1);
		System.out.println("------");
		tV.StopTv(1);
	}

}