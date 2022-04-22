package com.lixin.iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator<Department> {

    //����������Ҫ֪��Department���������ķ�ʽ���=>����
    Department[] departments;
	//������λ��
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    //�ж��Ƿ�����һ��Ԫ��
    @Override
    public boolean hasNext() {
		return position < departments.length && departments[position] != null;
    }

    //������һ��Ԫ��
    @Override
    public Department next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

}