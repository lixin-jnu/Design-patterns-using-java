package com.lixin.singleton.type2;

/**
 * ����ʽ(��̬�����)
 */

public class SingletonTest02 {

	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance1 == instance2);//true
		System.out.println("instance1.hashCode=" + instance1.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}

}

class Singleton {
	
	//1.������˽�л�,�ⲿ����new
	private Singleton() {}

	//2.�����ڲ����嵥����������
	private static Singleton instance;

	//3.�ھ�̬�������,������������
	static {
		instance = new Singleton();
	}

	//4.�ṩһ�������ľ�̬����,����ʵ������
	public static Singleton getInstance() {
		return instance;
	}
	
}