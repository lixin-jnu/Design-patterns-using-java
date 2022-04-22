package com.lixin.visitor;

import java.util.*;

/*
 * ����ṹ:����ܶ���(Man/Woman����,���elementԪ��)
 * 1.����ṹ�Ƚ��ȶ�,��������Ҫ�ڴ˶���ṹ�϶����µĲ���;
 * 2.��Ҫ��һ������ṹ�еĶ�����кܶ಻ͬ���Ҳ���صĲ���,����Ҫ������Щ����"��Ⱦ"��Щ�������,Ҳ��ϣ���������²���ʱ�޸���Щ��;
 */

public class ObjectStructure {

	//ά��һ������
	private final List<Person> persons = new ArrayList<>();
	
	//���ӵ�list
	public void attach(Person p) {
		persons.add(p);
	}

	//�Ƴ�
	public void detach(Person p) {
		persons.remove(p);
	}
	
	//��ʾ�������
	public void display(Action action) {
		for(Person p: persons) {
			p.accept(action);
		}
	}

}