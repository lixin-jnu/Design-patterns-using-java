package com.lixin.visitor;

//������visitor�ӿ�:�����ĸ���Ӧ��ElementԪ�صĸ�����ͬ,����������/�Ƴ�Ԫ��,�������ģʽ������
public abstract class Action {
	
	//�õ����ԵĲ���
	public abstract void getManResult(Man man);
	
	//�õ�Ů�ԵĲ���
	public abstract void getWomanResult(Woman woman);

}