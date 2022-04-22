package com.lixin.interpreter;

import java.io.*;
import java.util.HashMap;

public class ClientTest {

    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();//a+b
        HashMap<String, Integer> var = getValue(expStr);//var={a=10,b=20}
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果:" + expStr + "=" + calculator.run(var));
    }

    //获得表达式:手动输入
    public static String getExpStr() throws IOException {
        System.out.print("请输入表达式:");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    //获得值映射
    public static HashMap<String, Integer> getValue(String expStr) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
        for (char ch : expStr.toCharArray()) {
            if (ch != '+' && ch != '-' && ch != '*' && ch != '/') {
                if (!map.containsKey(String.valueOf(ch))) {
                    System.out.print("请输入" + ch + "的值：");
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }
        return map;
    }

}