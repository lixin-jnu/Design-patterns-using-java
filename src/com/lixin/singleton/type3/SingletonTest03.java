package com.lixin.singleton.type3;

/**
 * 懒汉式(线程不安全)
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
	
	//提供一个静态的公共方法,当使用到该方法时,才去创建instance(即懒汉式)
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}