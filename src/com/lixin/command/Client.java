package com.lixin.command;

public class Client {

	public static void main(String[] args) {
		//创建电灯对象(接收者)
		LightReceiver lightReceiver = new LightReceiver();
		//创建电灯相关的"开""关"命令
		Command lightOnCommand = new LightOnCommand(lightReceiver);
		Command lightOffCommand = new LightOffCommand(lightReceiver);
		//创建一个遥控器
		RemoteController remoteController = new RemoteController();
		//给我们的遥控器设置命令,比如no=0是电灯的"开"和"关"的操作
		remoteController.setCommand(0, lightOnCommand, lightOffCommand);
		System.out.println("--------按下灯的\"开\"按钮-----------");
		remoteController.onButtonWasPushed(0);
		System.out.println("--------按下灯的\"关\"按钮-----------");
		remoteController.offButtonWasPushed(0);
		System.out.println("--------按下\"撤销\"按钮-----------");
		remoteController.undoButtonWasPushed();
		TVReceiver tvReceiver = new TVReceiver();
		TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
		TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
		//给我们的遥控器设置命令,比如no=1是电视机的"开"和"关"的操作
		remoteController.setCommand(1, tvOnCommand, tvOffCommand);
		System.out.println("--------按下电视机的\"开\"按钮-----------");
		remoteController.onButtonWasPushed(1);
		System.out.println("--------按下电视机的\"关\"按钮-----------");
		remoteController.offButtonWasPushed(1);
		System.out.println("--------按下\"撤销\"按钮-----------");
		remoteController.undoButtonWasPushed();
	}

}