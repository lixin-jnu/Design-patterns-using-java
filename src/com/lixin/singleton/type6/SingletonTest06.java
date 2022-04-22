package com.lixin.singleton.type6;

/**
 * ˫�ؼ��(Double-Check)
 */

public class SingletonTest06 {

	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance1 == instance2);//true
		System.out.println("instance1.hashCode=" + instance1.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}

}

class Singleton {

	private static volatile Singleton instance;
	
	private Singleton() {}
	
	//�ṩһ����̬�Ĺ�������,����˫�ؼ�����,����̰߳�ȫ����|����������|��֤Ч��,�Ƽ�ʹ��
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
			
		}
		return instance;
	}

}