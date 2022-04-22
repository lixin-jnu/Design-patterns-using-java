package com.lixin.prototype.deepclone;

public class Client {

    public static void main(String[] args) throws Exception {
        DeepProtoType p = new DeepProtoType();
        p.name = "�ν�";
        p.deepCloneableTarget = new DeepCloneableTarget("��ţ", "�о���Ա");
        //��ʽ1������
        DeepProtoType p2 = (DeepProtoType) p.clone();
        System.out.println("p.name=" + p.name + ",p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
        System.out.println("p2.name=" + p2.name + ",p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());
        //��ʽ2������
        DeepProtoType p3 = (DeepProtoType) p.deepClone();
        System.out.println("p.name=" + p.name + ",p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
        System.out.println("p3.name=" + p3.name + ",p3.deepCloneableTarget=" + p3.deepCloneableTarget.hashCode());
    }

}
