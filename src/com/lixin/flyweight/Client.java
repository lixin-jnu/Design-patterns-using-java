package com.lixin.flyweight;

public class Client {

    public static void main(String[] args) {
        //����һ��������
        WebSiteFactory factory = new WebSiteFactory();
        //�ͻ�Ҫһ����������ʽ��������վ
        WebSite webSite1 = factory.getWebSiteCategory("����");
        webSite1.use(new User("tom"));
        //�ͻ�Ҫһ���Բ�����ʽ��������վ
        WebSite webSite2 = factory.getWebSiteCategory("����");
        webSite2.use(new User("jack"));
        //�ͻ�Ҫһ���Բ�����ʽ��������վ
        WebSite webSite3 = factory.getWebSiteCategory("����");
        webSite3.use(new User("mary"));
        //�ͻ�Ҫһ���Բ�����ʽ��������վ
        WebSite webSite4 = factory.getWebSiteCategory("����");
        webSite4.use(new User("king"));
        System.out.println("��վ����=" + factory.getWebSiteCount());
        //��Ԫģʽ��Integer�е�Ӧ��(IntegerCache[-128,127])
		Integer _1 = Integer.valueOf(127);
		Integer _2 = Integer.valueOf(127);
		System.out.println(_1 == _2);//true
    }

}