package com.lixin.responsibilitychain;

public class CollegeApprover extends Approver {

    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 5000 && purchaseRequest.getPrice() <= 10000) {
            System.out.println("????????id=" + purchaseRequest.getId() + "??" + getName() + "????~");
        } else {
            approver.processRequest(purchaseRequest);
        }
    }

}