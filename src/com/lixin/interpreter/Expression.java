package com.lixin.interpreter;

import java.util.HashMap;

/*
 * ���ʽ������,ͨ��HashMap��ֵ�Կ��Ի�ȡ��������ֵ
 */
public abstract class Expression {

    /*
     * key���Ǳ���[a,b,c],value���Ǿ��Ǿ���ֵ;
     * HashMap:{a=10,b=20};
     */
    public abstract int interpreter(HashMap<String, Integer> var);

}