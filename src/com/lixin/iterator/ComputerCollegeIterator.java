package com.lixin.iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator<Department> {

    //这里我们需要知道Department是以怎样的方式存放=>数组
    Department[] departments;
	//遍历的位置
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    //判断是否还有下一个元素
    @Override
    public boolean hasNext() {
		return position < departments.length && departments[position] != null;
    }

    //返回下一个元素
    @Override
    public Department next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

}