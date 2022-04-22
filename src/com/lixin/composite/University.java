package com.lixin.composite;

import java.util.*;

//University����Composite,���Թ���College
public class University extends OrganizationComponent {

    //��Ͻ�ȥһ����ʾ������ѧԺ��List
	List<OrganizationComponent> organizationComponents = new ArrayList<>();

    //������
    public University(String name) {
        super(name);
    }

    //��дadd
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    //��дremove
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    //print����:�������University��������ѧԺ
    @Override
    protected void print() {
        System.out.println("--" + getName() + "--");
        //����organizationComponents
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }

}