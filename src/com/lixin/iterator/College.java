package com.lixin.iterator;

import java.util.Iterator;

public interface College {

    public String getName();

    //����Ժϵ�ķ���
    public void addDepartment(String name);

    //����һ��������
    public Iterator createIterator();

}