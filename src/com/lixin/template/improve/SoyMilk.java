package com.lixin.template.improve;

//������,��ʾ����������ģ����
public abstract class SoyMilk {

    //ģ�巽��make(),ģ�巽������ʹ��final����,��������ȥ����
    final void make() {
        select();
        if (customerWantCondiments()) {
            addCondiments();
        }
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

    //���ӷ���:�����Ƿ���Ҫ�������,�þ����ʵ����ȥ��д����false
    boolean customerWantCondiments() {
        return true;
    }

}