package com.lixin.template.improve_me;

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

    //���ӷ���:��ʵ��
    void addCondiments() {
        //nothing
    }

    //����
    void soak() {
        System.out.println("������:�ƶ������Ͽ�ʼ����,��Ҫ3Сʱ");
    }

    //����
    void beat() {
        System.out.println("���Ĳ�:�ƶ������Ϸŵ�������ȥ����");
    }

}