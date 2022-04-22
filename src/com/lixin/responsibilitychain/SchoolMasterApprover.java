package com.lixin.responsibilitychain;

public class SchoolMasterApprover extends Approver {

    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 30000) {
            System.out.println("������id=" + purchaseRequest.getId() + "��" + getName() + "����~");
        } else {
            approver.processRequest(purchaseRequest);
        }
    }

}