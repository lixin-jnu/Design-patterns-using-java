package com.lixin.factory.absfactory.pizzastore.order;

import java.io.*;
import com.lixin.factory.absfactory.pizzastore.pizza.Pizza;

public class OrderPizza {

    //������
    public OrderPizza(AbsFactory factory) {
        setFactory(factory);
    }

    private void setFactory(AbsFactory factory) {
        Pizza pizza = null;
        String orderType = "";//�û�����
        do {
            orderType = getType();
            //factory�����Ǳ����Ĺ�������,Ҳ�������׶صĹ�������
            pizza = factory.createPizza(orderType);
            if (pizza != null) {//�����ɹ�
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("����ʧ��!");
                break;
            }
        } while (true);
    }

    //дһ������,���Ի�ȡ�ͻ�ϣ����������������
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("�����붩������������:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
