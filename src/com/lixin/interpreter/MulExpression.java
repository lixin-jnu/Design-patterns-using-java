package com.lixin.interpreter;

import java.util.HashMap;

/*
 * 添加乘法运算符解释器->拓展非常方便
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