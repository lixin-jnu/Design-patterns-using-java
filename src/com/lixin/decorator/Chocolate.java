package com.lixin.decorator;

//�����Decorator,������ǵ�ζƷ
public class Chocolate extends Decorator {

    public Chocolate(Drink obj) {
        super(obj);
        setDes("�ɿ���");
        setPrice(2.5f);//��ζƷ�ļ۸�
    }

}