package com.lixin.command;

public class Client {

	public static void main(String[] args) {
		//������ƶ���(������)
		LightReceiver lightReceiver = new LightReceiver();
		//���������ص�"��""��"����
		Command lightOnCommand = new LightOnCommand(lightReceiver);
		Command lightOffCommand = new LightOffCommand(lightReceiver);
		//����һ��ң����
		RemoteController remoteController = new RemoteController();
		//�����ǵ�ң������������,����no=0�ǵ�Ƶ�"��"��"��"�Ĳ���
		remoteController.setCommand(0, lightOnCommand, lightOffCommand);
		System.out.println("--------���µƵ�\"��\"��ť-----------");
		remoteController.onButtonWasPushed(0);
		System.out.println("--------���µƵ�\"��\"��ť-----------");
		remoteController.offButtonWasPushed(0);
		System.out.println("--------����\"����\"��ť-----------");
		remoteController.undoButtonWasPushed();
		TVReceiver tvReceiver = new TVReceiver();
		TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
		TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
		//�����ǵ�ң������������,����no=1�ǵ��ӻ���"��"��"��"�Ĳ���
		remoteController.setCommand(1, tvOnCommand, tvOffCommand);
		System.out.println("--------���µ��ӻ���\"��\"��ť-----------");
		remoteController.onButtonWasPushed(1);
		System.out.println("--------���µ��ӻ���\"��\"��ť-----------");
		remoteController.offButtonWasPushed(1);
		System.out.println("--------����\"����\"��ť-----------");
		remoteController.undoButtonWasPushed();
	}

}