package com.lixin.composite;

import java.util.*;

//CollegeҲ��Composite,���Թ���Department
public class College extends OrganizationComponent {

    //List�д��College��������Department
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    //������
    public College(String name) {
        super(name);
    }

    //��дadd
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        //����ʵ��ҵ����,College�е�add��University�е�add��һ����ȫһ��
        organizationComponents.add(organizationComponent);
    }

    //��дremove
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    //print����:�������College��������Ժϵ
    @Override
    protected void print() {
        System.out.println("----" + getName() + "----");
        //����organizationComponents
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }

}