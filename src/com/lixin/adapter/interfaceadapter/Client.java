package com.lixin.adapter.interfaceadapter;

public class Client {

    public static void main(String[] args) {
        //�����ڲ���:����ʵ����������
        AbsAdapter absAdapter = new AbsAdapter() {
            //ʹ�������ڲ������ʽ,ֻ��Ҫȥ����������Ҫʹ�õĽӿڷ���
            @Override
            public void m1() {
                System.out.println("ʹ����m1�ķ���");
            }
        };
        absAdapter.m1();
        absAdapter.m2();
    }

}