package com.lixin.factory.simplefactory.pizzastore.order;

import java.io.*;
import com.lixin.factory.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizza2 {

    Pizza pizza = null;
    String orderType = "";//�û������

    //������
    public OrderPizza2() {
        do {
            orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType);
            if (pizza != null) {//�����ɹ�
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("��������ʧ��!");
                break;
            }
        } while (true);
    }

    //дһ������,���Ի�ȡ�ͻ�ϣ����������������
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("�����붩��Pizza������:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
