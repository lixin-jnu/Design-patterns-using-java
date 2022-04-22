package com.lixin.singleton.type1;

/**
 * ����ʽ(��̬����)
 */

public class SingletonTest01 {

	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance1.equals(instance2));//true
		System.out.println("instance1.hashCode=" + instance1.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}

}

class Singleton {
	
	//1.������˽�л�,�ⲿ����new
	private Singleton() {}

	//2.�����ڲ���������ʵ��
	private final static Singleton instance = new Singleton();
	
	//3.�ṩһ�������ľ�̬����,����ʵ������
	public static Singleton getInstance() {
		return instance;
	}
	
}