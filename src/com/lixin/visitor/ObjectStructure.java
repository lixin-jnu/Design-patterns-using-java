package com.lixin.visitor;

import java.util.*;

/*
 * 对象结构:管理很多人(Man/Woman对象,亦称element元素)
 * 1.对象结构比较稳定,但经常需要在此对象结构上定义新的操作;
 * 2.需要对一个对象结构中的对象进行很多不同的且不相关的操作,而需要避免这些操作"污染"这些对象的类,也不希望在增加新操作时修改这些类;
 */

public class ObjectStructure {

	//维护一个集合
	private final List<Person> persons = new ArrayList<>();
	
	//增加到list
	public void attach(Person p) {
		persons.add(p);
	}

	//移除
	public void detach(Person p) {
		persons.remove(p);
	}
	
	//显示测评情况
	public void display(Action action) {
		for(Person p: persons) {
			p.accept(action);
		}
	}

}