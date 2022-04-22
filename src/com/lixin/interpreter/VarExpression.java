package com.lixin.interpreter;

import java.util.HashMap;

/*
 * 变量解释器
 */
public class VarExpression extends Expression {

    private String key;//key=a,key=b,key=c

    public VarExpression(String key) {
        this.key = key;
    }

    //interpreter根据变量名称返回对应值
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(getKey());
    }

	public String getKey() {
		return key;
	}

}