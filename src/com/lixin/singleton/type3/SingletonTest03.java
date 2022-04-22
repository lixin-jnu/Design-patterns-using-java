package com.lixin.singleton.type3;

/**
 * ����ʽ(�̲߳���ȫ)
 */

public class SingletonTest03 {

	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance1 == instance2);//true
		System.out.println("instance1.hashCode=" + instance1.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}

}

class Singleton {

	private static Singleton instance;
	
	private Singleton() {}
	
	//�ṩһ����̬�Ĺ�������,��ʹ�õ��÷���ʱ,��ȥ����instance(������ʽ)
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}