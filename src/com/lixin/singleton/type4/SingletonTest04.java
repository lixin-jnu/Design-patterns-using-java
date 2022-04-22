package com.lixin.singleton.type4;

/**
 * 懒汉式(线程安全)
 */

public class SingletonTest04 {

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
	
	//提供一个静态的公共方法,加入同步处理的代码(synchronized),解决线程安全问题
	public static synchronized Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}