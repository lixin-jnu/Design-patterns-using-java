package com.lixin.interpreter;

import java.util.HashMap;

/*
 * 表达式抽象类,通过HashMap键值对可以获取到变量的值
 */
public abstract class Expression {

    /*
     * key就是变量[a,b,c],value就是就是具体值;
     * HashMap:{a=10,b=20};
     */
    public abstract int interpreter(HashMap<String, Integer> var);

}