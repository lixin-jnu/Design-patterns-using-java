package com.lixin.flyweight;

import java.util.HashMap;

//��վ������,������Ҫ����ѹһ����վ
public class WebSiteFactory {

    //Map����:�䵱�ص�����
    private HashMap<String, ConcreteWebSite> pools = new HashMap<>();

    //������վ������,����һ����վ,���û�оʹ���һ���������վ,�����뵽����,Ȼ�󷵻�
    public WebSite getWebSiteCategory(String type) {
        if (!pools.containsKey(type)) {
            //����һ����վ,�����뵽����
            pools.put(type, new ConcreteWebSite(type));
        }
        return (WebSite) pools.get(type);
    }

    //��ȡ��վ���͵�����(�����ж��ٸ���վ����)
    public int getWebSiteCount() {
        return pools.size();
    }

}