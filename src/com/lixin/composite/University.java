package com.lixin.composite;

import java.util.*;

//University就是Composite,可以管理College
public class University extends OrganizationComponent {

    //组合进去一个表示所包含学院的List
	List<OrganizationComponent> organizationComponents = new ArrayList<>();

    //构造器
    public University(String name) {
        super(name);
    }

    //重写add
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    //重写remove
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    //print方法:就是输出University所包含的学院
    @Override
    protected void print() {
        System.out.println("--" + getName() + "--");
        //遍历organizationComponents
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }

}