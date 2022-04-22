package com.lixin.prototype.deepclone;

import java.io.*;

public class DeepProtoType implements Serializable, Cloneable {

    public String name;//String类型
    public DeepCloneableTarget deepCloneableTarget;//引用类型

    public DeepProtoType() {
        super();
    }

    //深拷贝-方式1-使用clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //这里完成对基本数据类型和String的克隆
        DeepProtoType deepProtoType = (DeepProtoType) super.clone();
		//对引用类型的属性单独处理(如果有多个引用类型成员变量,则会非常繁杂)
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepProtoType;
    }

    //深拷贝-方式2-通过对象的序列化实现(推荐使用)
    public Object deepClone() {
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);//对当前这个对象以对象流的方式输出
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType) ois.readObject();
            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e2) {
                System.out.println(e2.getMessage());
            }
        }
    }

}
