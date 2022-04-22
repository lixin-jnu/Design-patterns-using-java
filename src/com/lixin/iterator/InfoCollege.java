package com.lixin.iterator;

import java.util.*;

public class InfoCollege implements College {

	List<Department> departmentList;

	public InfoCollege() {
		departmentList = new ArrayList<>();
		addDepartment("��Ϣ��ȫרҵ");
		addDepartment("���簲ȫרҵ");
	}
	
	@Override
	public String getName() {
		return "��Ϣ����ѧԺ";
	}

	@Override
	public void addDepartment(String name) {
		Department department = new Department(name);
		departmentList.add(department);
	}

	@Override
	public Iterator createIterator() {
		return new InfoCollegeIterator(departmentList);
	}

}