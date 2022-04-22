package com.lixin.singleton.type6;

/**
 * 双重检查(Double-Check)
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
	
	//提供一个静态的公共方法,加入双重检查代码,解决线程安全问题|懒加载问题|保证效率,推荐使用
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