package com.lixin.template;

//������,��ʾ����������ģ����
public abstract class SoyMilk {

    //ģ�巽��make(),ģ�巽������ʹ��final����,��������ȥ����
    final void make() {
        select();
        addCondiments();
        soak();
        beat();
    }

    //ѡԭ��
    void select() {
        System.out.println("��һ��:ѡ��õ����ʻƶ�");
    }

    //��Ӳ�ͬ������,���󷽷�,�������ʵ��
    abstract void addCondiments();

    //����
    void soak() {
        System.out.println("������:�ƶ������Ͽ�ʼ����,��Ҫ3Сʱ");
    }

    //����
    void beat() {
        System.out.println("���Ĳ�:�ƶ������Ϸŵ�������ȥ����");
    }

}