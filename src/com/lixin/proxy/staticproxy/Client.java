package com.lixin.proxy.staticproxy;

public class Client {

    public static void main(String[] args) {
        //����Ŀ�����(���������)
        TeacherDao teacherDao = new TeacherDao();
        //�����������,ͬʱ����������󴫵ݸ��������
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        //ͨ���������,���õ����������ķ���,��ִ�е��Ǵ������ķ���,���������ȥ����Ŀ�����ķ���
        teacherDaoProxy.teach();
    }

}