package com.lixin.singleton.type2;

/**
 * 饿汉式(静态代码块)
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
	
	//1.构造器私有化,外部不能new
	private Singleton() {}

	//2.本类内部定义单例对象声明
	private static Singleton instance;

	//3.在静态代码块中,创建单例对象
	static {
		instance = new Singleton();
	}

	//4.提供一个公共的静态方法,返回实例对象
	public static Singleton getInstance() {
		return instance;
	}
	
}