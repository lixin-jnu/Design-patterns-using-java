package com.lixin.proxy.staticproxy;

//�������(��̬����)
public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao target;//Ŀ�����,ͨ���ӿ����ۺ�

    //������
    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("��ʼ����~");
        System.out.println("���Խ��й�����չ......");
        target.teach();
        System.out.println("�������~");
    }

}