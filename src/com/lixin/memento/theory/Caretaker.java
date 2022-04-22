package com.lixin.memento.theory;

import java.util.*;

public class Caretaker {
	
	//在List集合中会有很多的备忘录对象
	private List<Memento> mementoList = new ArrayList<>();
	
	public void add(Memento memento) {
		mementoList.add(memento);
	}
	
	//获取Originator第index个状态
	public Memento get(int index) {
		return mementoList.get(index);
	}

}