package com.lixin.interpreter;

import java.util.HashMap;

/*
 * �����������(+/-)������:
 * 1.ÿ��������Ŷ�ֻ���Լ��������������й�ϵ;
 * 2.��������������Ҳ�п�����һ�������Ľ��,���ۺ�������,����Expression���ʵ����;
 */
public class SymbolExpression extends Expression {

	protected Expression left;
	protected Expression right;

	public SymbolExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	//��ΪSymbolExpression������������ʵ��,���interpreter��һ��Ĭ��ʵ��
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return 0;
	}

}