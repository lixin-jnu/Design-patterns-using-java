package com.lixin.interpreter;

import java.util.HashMap;

/*
 * ��ӳ˷������������->��չ�ǳ�����
 */
public class MulExpression extends SymbolExpression {

    public MulExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return this.left.interpreter(var) * this.right.interpreter(var);
    }

}