package com.lixin.visitor;

public class Client {

	public static void main(String[] args) {
		//����ObjectStructure
		ObjectStructure objectStructure = new ObjectStructure();
		objectStructure.attach(new Man());
		objectStructure.attach(new Woman());
		//�ɹ�
		Success success = new Success();
		objectStructure.display(success);
		//ʧ��
		System.out.println("===============");
		Fail fail = new Fail();
		objectStructure.display(fail);
		System.out.println("===============");
		Wait wait = new Wait();
		objectStructure.display(wait);
	}

}