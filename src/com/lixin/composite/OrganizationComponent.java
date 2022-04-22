package com.lixin.composite;

public abstract class OrganizationComponent {

    private String name;//名字

	//构造器
	public OrganizationComponent(String name) {
		this.name = name;
	}

	//add和remove方法要进行默认实现,不设置为抽象方法->叶子节点不需要去实现
    protected void add(OrganizationComponent organizationComponent) {
        //默认实现
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent) {
        //默认实现
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //print方法设置为抽象方法,子类都需要去实现
    protected abstract void print();

}