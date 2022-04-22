package com.lixin.responsibilitychain;

//请求类
public class PurchaseRequest {

    private float price;//请求金额
    private int id;

    //构造器
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