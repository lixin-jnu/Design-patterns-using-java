package com.lixin.singleton.type7;

/**
 * ��̬�ڲ���
 */

public class SingletonTest07 {

	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance1 == instance2);//true
		System.out.println("instance1.hashCode=" + instance1.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}

}

class Singleton {
	
	//������˽�л�
	private Singleton() {}
	
	//дһ����̬�ڲ���,��������һ����̬����Singleton
	private static class SingletonInstance {
		private static final Singleton INSTANCE = new Singleton(); 
	}
	
	//�ṩһ����̬�Ĺ�������,ֱ�ӷ���SingletonInstance.INSTANCE
	public static Singleton getInstance() {
		return SingletonInstance.INSTANCE;
	}

}