package com.lixin.composite;

public class Client {

    public static void main(String[] args) {
        //1.�Ӵ�С��������->����ѧУ
        OrganizationComponent university = new University("�廪��ѧ");
        //2.����ѧԺ
        OrganizationComponent computerCollege = new College("�����ѧԺ");
        OrganizationComponent infoEngineerCollege = new College("��Ϣ����ѧԺ");
        //3.��ѧԺ���뵽ѧУ
        university.add(computerCollege);
        university.add(infoEngineerCollege);
        //4.��������ѧԺ�����Ժϵ,�����뵽ѧԺ
        computerCollege.add(new Department("�������"));
        computerCollege.add(new Department("����ռ䰲ȫ"));
        computerCollege.add(new Department("�������ѧ�뼼��"));
        infoEngineerCollege.add(new Department("ͨ�Ź���"));
        infoEngineerCollege.add(new Department("��Ϣ��ѧ�뼼��"));
        //5.��ӡ��֯�ṹ
        university.print();
		System.out.println("******");
        computerCollege.print();
		System.out.println("******");
        university.remove(infoEngineerCollege);
        university.print();
    }

}