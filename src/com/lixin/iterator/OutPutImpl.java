package com.lixin.iterator;

import java.util.*;

public class OutPutImpl {

    //ѧԺ����
    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    //��������ѧԺ,Ȼ�����printDepartment�������ѧԺ��Ժϵ
    public void printCollege() {
        for (College college : collegeList) {
            System.out.println("-" + college.getName());
            printDepartment(college.createIterator());
        }
    }

    //���ѧԺ���е�Ժϵ
    public void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department d = (Department) iterator.next();
            System.out.println("--" + d.getName());
        }
    }

}