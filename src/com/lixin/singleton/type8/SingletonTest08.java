package com.lixin.singleton.type8;

/**
 * ö��(���Ƽ�ʹ�õķ�ʽ)
 */

public class SingletonTest08 {

	public static void main(String[] args) {
		Singleton instance1 = Singleton.INSTANCE;
		Singleton instance2 = Singleton.INSTANCE;
		System.out.println(instance1 == instance2);
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		instance1.sayOK();
	}

}

enum Singleton {

	INSTANCE;//����

	public void sayOK() {
		System.out.println("ok~");
	}

}