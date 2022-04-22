package com.lixin.composite;

public class Client {

    public static void main(String[] args) {
        //1.从大到小创建对象->创建学校
        OrganizationComponent university = new University("清华大学");
        //2.创建学院
        OrganizationComponent computerCollege = new College("计算机学院");
        OrganizationComponent infoEngineerCollege = new College("信息工程学院");
        //3.将学院加入到学校
        university.add(computerCollege);
        university.add(infoEngineerCollege);
        //4.创建各个学院下面的院系,并加入到学院
        computerCollege.add(new Department("软件工程"));
        computerCollege.add(new Department("网络空间安全"));
        computerCollege.add(new Department("计算机科学与技术"));
        infoEngineerCollege.add(new Department("通信工程"));
        infoEngineerCollege.add(new Department("信息科学与技术"));
        //5.打印组织结构
        university.print();
		System.out.println("******");
        computerCollege.print();
		System.out.println("******");
        university.remove(infoEngineerCollege);
        university.print();
    }

}