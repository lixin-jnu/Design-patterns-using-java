package com.lixin.interpreter;

import java.util.*;

public class Calculator {

    //������ʽ
    private Expression expression;

    //���캯�����β�����
    public Calculator(String expStr) {//expStr:a+b
        //���������Ⱥ�˳��
        Stack<Expression> stack = new Stack<>();
        //���ʽ��ֳ��ַ�����
        char[] charArray = expStr.toCharArray();//[a,+,b]
        Expression left, right;
        //�������ǵ��ַ�����,������[a,+,b],����Բ�ͬ�����������
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    left = stack.pop();//ȡ������ʽ
                    right = new VarExpression(String.valueOf(charArray[++i]));//ȡ���ұ��ʽ
                    stack.push(new AddExpression(left, right));//Ȼ����ݵõ���left��right����AddExpression���뵽stack��
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
        //������������charArray�����,stack�͵õ�����Expression
        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> var) {
        //��󴫵ݸ�expression��interpreter���н���ִ��
        return this.expression.interpreter(var);
    }

}