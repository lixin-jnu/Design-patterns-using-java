package com.lixin.interpreter;

import java.util.HashMap;

/*
 * ����������
 */
public class VarExpression extends Expression {

    private String key;//key=a,key=b,key=c

    public VarExpression(String key) {
        this.key = key;
    }

    //interpreter���ݱ������Ʒ��ض�Ӧֵ
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(getKey());
    }

	public String getKey() {
		return key;
	}

}