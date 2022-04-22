package com.lixin.iterator;

import java.util.*;

public class OutPutImpl {

    //学院集合
    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    //遍历所有学院,然后调用printDepartment输出各个学院的院系
    public void printCollege() {
        for (College college : collegeList) {
            System.out.println("-" + college.getName());
            printDepartment(college.createIterator());
        }
    }

    //输出学院所有的院系
    public void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department d = (Department) iterator.next();
            System.out.println("--" + d.getName());
        }
    }

}