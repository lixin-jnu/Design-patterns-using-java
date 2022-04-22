package com.lixin.proxy.dynamicproxy;

public class Client {

    public static void main(String[] args) {
        //����Ŀ�����
        ITeacherDao target = new TeacherDao();
        //��Ŀ����󴴽��������,����ת��ITeacherDao
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        System.out.println(proxyInstance.getClass());
        //ͨ���������,����Ŀ�����ķ���
        proxyInstance.teach();
        proxyInstance.sayHello("tom");
    }

}