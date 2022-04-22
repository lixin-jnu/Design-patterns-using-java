package com.lixin.proxy.cglib;

public class Client {

    public static void main(String[] args) {
        //����Ŀ�����
        TeacherDao target = new TeacherDao();
        //��ȡ�������,���ҽ�Ŀ����󴫵ݸ��������
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(target).getProxyInstance();
        //ִ�д������ķ���,����intercept����,�Ӷ�ʵ�ֶ�Ŀ�����ĵ���
        String res = proxyInstance.teach();
        System.out.println("res=" + res);
    }

}