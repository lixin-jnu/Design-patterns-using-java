package com.lixin.adapter.interfaceadapter;

public class Client {

    public static void main(String[] args) {
        //匿名内部类:可以实例化抽象类
        AbsAdapter absAdapter = new AbsAdapter() {
            //使用匿名内部类的形式,只需要去覆盖我们需要使用的接口方法
            @Override
            public void m1() {
                System.out.println("使用了m1的方法");
            }
        };
        absAdapter.m1();
        absAdapter.m2();
    }

}