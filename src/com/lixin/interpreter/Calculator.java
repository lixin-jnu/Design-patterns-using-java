package com.lixin.interpreter;

import java.util.*;

public class Calculator {

    //定义表达式
    private Expression expression;

    //构造函数传参并解析
    public Calculator(String expStr) {//expStr:a+b
        //安排运算先后顺序
        Stack<Expression> stack = new Stack<>();
        //表达式拆分成字符数组
        char[] charArray = expStr.toCharArray();//[a,+,b]
        Expression left, right;
        //遍历我们的字符数组,即遍历[a,+,b],并针对不同的情况做处理
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    left = stack.pop();//取出左表达式
                    right = new VarExpression(String.valueOf(charArray[++i]));//取出右表达式
                    stack.push(new AddExpression(left, right));//然后根据得到的left和right构建AddExpression加入到stack中
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                case '*':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new MulExpression(left, right));
                    break;
                case '/':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new DivExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }
        //当遍历完整个charArray数组后,stack就得到最后的Expression
        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> var) {
        //最后传递给expression的interpreter进行解释执行
        return this.expression.interpreter(var);
    }

}