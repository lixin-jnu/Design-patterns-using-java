package com.lixin.visitor;

/*
 * ˵��:
 * 1.��������ʹ�õ���˫����,�������ڿͻ��˳�����,������״̬��Ϊ�������ݵ�Woman��(��һ�η���);
 * 2.Ȼ��Woman�������Ϊ������"���巽��"�з���getWomanResult,ͬʱ���Լ�(this)��Ϊ��������,��ɵڶ��εķ���;
 */

//����Woman��
public class Woman extends Person{

	@Override
	public void accept(Action action) {
		action.getWomanResult(this);
	}

}