package com.lixin.mediator.smarthouse;

public abstract class Mediator {

    //���н��߶�����,��ͬ���������뵽HashMap������
    public abstract void Register(String colleagueName, Colleague colleague);

    //������Ϣ,�ɾ����ͬ������󷢳�,stateChange�Ƕ���Ҫ���еĶ����ı�ʶ
    public abstract void GetMessage(int stateChange, String colleagueName);

}