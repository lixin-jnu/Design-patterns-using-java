package com.lixin.visitor;

//������Fail��
public class Fail extends Action {

	@Override
	public void getManResult(Man man) {
		System.out.println("�������۸ø���ʧ��!");
	}

	@Override
	public void getWomanResult(Woman woman) {
		System.out.println("Ů�����۸ø���ʧ��!");
	}

}