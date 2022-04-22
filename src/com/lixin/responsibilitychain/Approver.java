package com.lixin.responsibilitychain;

public abstract class Approver {

    Approver approver;//��һ��������
    String name;//����������

    public Approver(String name) {
        this.name = name;
    }

	public String getName() {
		return name;
	}

	//��һ��������
    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    //��������ķ���,����һ������,���������������,��˸÷����ǳ��󷽷�
    public abstract void processRequest(PurchaseRequest purchaseRequest);

}