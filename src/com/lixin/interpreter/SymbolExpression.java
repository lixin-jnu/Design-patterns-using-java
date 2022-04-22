package com.lixin.interpreter;

import java.util.HashMap;

/*
 * 抽象运算符号(+/-)解析器:
 * 1.每个运算符号都只和自己左右两个数字有关系;
 * 2.但左右两个数字也有可能是一个解析的结果,无论何种类型,都是Expression类的实现类;
 */
public class SymbolExpression extends Expression {

	protected Expression left;
	protected Expression right;

	public SymbolExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	//因为SymbolExpression是让其子类来实现,因此interpreter是一个默认实现
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return 0;
	}

}