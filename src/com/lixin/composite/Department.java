package com.lixin.composite;

public class Department extends OrganizationComponent {

    /*
     * 1.ԺϵΪҶ�ӽڵ�,û�м���List
     * 2.add��remove��������д
     */

    public Department(String name) {
        super(name);
    }

    @Override
    protected void print() {
        System.out.println("------" + getName() + "------");
    }

}