package com.lixin.responsibilitychain;

//������
public class PurchaseRequest {

    private float price;//������
    private int id;

    //������
    public PurchaseRequest(float price, int id) {
        this.price = price;
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

}