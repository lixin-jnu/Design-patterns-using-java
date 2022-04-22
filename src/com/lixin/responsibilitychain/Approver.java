package com.lixin.responsibilitychain;

public abstract class Approver {

    Approver approver;//下一个处理者
    String name;//处理者名字

    public Approver(String name) {
        this.name = name;
    }

	public String getName() {
		return name;
	}

	//下一个处理者
    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    //处理请求的方法,传入一个请求,处理是子类来完成,因此该方法是抽象方法
    public abstract void processRequest(PurchaseRequest purchaseRequest);

}