package com.lixin.composite;

public class Department extends OrganizationComponent {

    /*
     * 1.院系为叶子节点,没有集合List
     * 2.add和remove都无需重写
     */

    public Department(String name) {
        super(name);
    }

    @Override
    protected void print() {
        System.out.println("------" + getName() + "------");
    }

}