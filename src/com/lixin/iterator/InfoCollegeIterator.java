package com.lixin.iterator;

import java.util.*;

public class InfoCollegeIterator implements Iterator<Department> {

    List<Department> departmentList;//信息工程学院是以List集合的方式存放院系
    int index = -1;//索引

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    //判断list中还有没有下一个元素
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