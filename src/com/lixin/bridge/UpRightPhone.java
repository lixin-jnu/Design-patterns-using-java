package com.lixin.bridge;

//ֱ��ʽ�ֻ���->�̳г�����Phone
public class UpRightPhone extends Phone {

    //������
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("ֱ����ʽ");
    }

    public void close() {
        super.close();
        System.out.println("ֱ����ʽ");
    }

    public void call() {
        super.call();
        System.out.println("ֱ����ʽ");
    }

}