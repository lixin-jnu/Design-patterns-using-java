package com.lixin.flyweight;

//������վ
public class ConcreteWebSite extends WebSite {

    //type:����Ĳ���(�ڲ�״̬)
    private String type;//��վ��������ʽ(����)

    //������
    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {//User:������Ĳ���(�ⲿ״̬)
        System.out.println("��վ�ķ�����ʽΪ:" + type + ",�û�Ϊ:" + user.getName());
    }

}