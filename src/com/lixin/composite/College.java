package com.lixin.composite;

import java.util.*;

//College也是Composite,可以管理Department
public class College extends OrganizationComponent {

    //List中存放College所包含的Department
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    //构造器
    public College(String name) {
        super(name);
    }

    //重写add
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        //将来实际业务中,College中的add和University中的add不一定完全一样
        organizationComponents.add(organizationComponent);
    }

    //重写remove
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    //print方法:就是输出College所包含的院系
    @Override
    protected void print() {
        System.out.println("----" + getName() + "----");
        //遍历organizationComponents
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }

}