package com.lixin.proxy.staticproxy;

//Ŀ�����(������Ķ���)
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("��ʦ�ڿ���......");
    }

}