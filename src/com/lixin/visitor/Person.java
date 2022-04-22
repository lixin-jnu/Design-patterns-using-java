package com.lixin.visitor;

//元素/对象Element接口Person
public abstract class Person {
	
	//提供一个方法,让访问者可以访问
	public abstract void accept(Action action);

}