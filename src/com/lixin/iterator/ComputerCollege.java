package com.lixin.iterator;

import java.util.Iterator;

public class ComputerCollege implements College {

    Department[] departments;
    int numOfDepartment = 0;//���浱ǰ����Ķ������

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("Javaרҵ");
        addDepartment("PHPרҵ");
        addDepartment("Pythonרҵ");
    }

    @Override
    public String getName() {
        return "�����ѧԺ";
    }

    @Override
    public void addDepartment(String name) {
        Department department = new Department(name);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }

}