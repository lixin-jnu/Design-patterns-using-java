package com.lixin.memento.theory;

import java.util.*;

public class Caretaker {
	
	//��List�����л��кܶ�ı���¼����
	private List<Memento> mementoList = new ArrayList<>();
	
	public void add(Memento memento) {
		mementoList.add(memento);
	}
	
	//��ȡOriginator��index��״̬
	public Memento get(int index) {
		return mementoList.get(index);
	}

}