package com.lixin.composite;

public abstract class OrganizationComponent {

    private String name;//����

	//������
	public OrganizationComponent(String name) {
		this.name = name;
	}

	//add��remove����Ҫ����Ĭ��ʵ��,������Ϊ���󷽷�->Ҷ�ӽڵ㲻��Ҫȥʵ��
    protected void add(OrganizationComponent organizationComponent) {
        //Ĭ��ʵ��
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent) {
        //Ĭ��ʵ��
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //print��������Ϊ���󷽷�,���඼��Ҫȥʵ��
    protected abstract void print();

}