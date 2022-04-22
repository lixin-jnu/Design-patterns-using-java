package com.lixin.iterator;

import java.util.Iterator;

public interface College {

    public String getName();

    //增加院系的方法
    public void addDepartment(String name);

    //返回一个迭代器
    public Iterator createIterator();

}