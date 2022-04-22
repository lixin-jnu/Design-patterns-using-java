package com.lixin.bridge;

public abstract class Phone {

    //�ۺ��ֻ�Ʒ��
    private Brand brand;

    //������
    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void close() {
        this.brand.close();
    }

    protected void call() {
        this.brand.call();
    }

}