package com.lixin.visitor;

//������Wait��:��չʱʮ�ַ���,����Ҫ�޸Ķ���ṹ,Ҳ����"��Ⱦ"����
public class Wait extends Action {

	@Override
	public void getManResult(Man man) {
		System.out.println("�������۸ø��ִ���..");
	}

	@Override
	public void getWomanResult(Woman woman) {
		System.out.println("Ů�����۸ø��ִ���..");
	}

}