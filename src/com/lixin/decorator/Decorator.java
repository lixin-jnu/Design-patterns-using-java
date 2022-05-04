package com.lixin.decorator;

/*
 * �̳�Drink���Ҿۺ���һ��Drink����
 */
public class Decorator extends Drink {

    //�ۺϽ�Drink,�������װ��
    private Drink obj;

    public Decorator(Drink obj) {//�ۺ�
        this.obj = obj;
    }

    @Override
    public float cost() {
        //getPrice����Լ��ļ۸�
        return getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        //obj.getDes()�����װ���ߵ���Ϣ
        return this.des + getPrice() + "+" + obj.getDes();
    }

}