package com.lixin.prototype.deepclone;

import java.io.*;

public class DeepProtoType implements Serializable, Cloneable {

    public String name;//String����
    public DeepCloneableTarget deepCloneableTarget;//��������

    public DeepProtoType() {
        super();
    }

    //���-��ʽ1-ʹ��clone����
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //������ɶԻ����������ͺ�String�Ŀ�¡
        DeepProtoType deepProtoType = (DeepProtoType) super.clone();
		//���������͵����Ե�������(����ж���������ͳ�Ա����,���ǳ�����)
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepProtoType;
    }

    //���-��ʽ2-ͨ����������л�ʵ��(�Ƽ�ʹ��)
    public Object deepClone() {
        //����������
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //���л�
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);//�Ե�ǰ��������Զ������ķ�ʽ���
            //�����л�
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType) ois.readObject();
            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            //�ر���
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
