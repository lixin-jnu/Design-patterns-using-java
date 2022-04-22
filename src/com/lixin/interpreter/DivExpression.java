package com.lixin.interpreter;

import java.util.HashMap;

/*
 * ��ӳ��������������->��չ�ǳ�����
 */
public class DivExpression extends SymbolExpression {

    public DivExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return this.left.interpreter(var) / this.right.interpreter(var);
    }

}