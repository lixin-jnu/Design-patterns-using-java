package com.lixin.visitor;

//访问者visitor接口:方法的个数应与Element元素的个数相同,如果经常添加/移除元素,则访问者模式不适用
public abstract class Action {
	
	//得到男性的测评
	public abstract void getManResult(Man man);
	
	//得到女性的测评
	public abstract void getWomanResult(Woman woman);

}