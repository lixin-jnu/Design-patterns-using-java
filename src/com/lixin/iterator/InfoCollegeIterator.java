package com.lixin.iterator;

import java.util.*;

public class InfoCollegeIterator implements Iterator<Department> {

    List<Department> departmentList;//��Ϣ����ѧԺ����List���ϵķ�ʽ���Ժϵ
    int index = -1;//����

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    //�ж�list�л���û����һ��Ԫ��
    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() - 1) {
            return false;
        } else {
            index += 1;
            return true;
        }
    }

    @Override
    public Department next() {
        return departmentList.get(index);
    }

}