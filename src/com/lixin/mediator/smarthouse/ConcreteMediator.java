package com.lixin.mediator.smarthouse;

import java.util.HashMap;

//������н�����
public class ConcreteMediator extends Mediator {

    //����,�������е�ͬ�¶���
    private HashMap<String, Colleague> colleagueMap;

    public ConcreteMediator() {
        colleagueMap = new HashMap<>();
    }

    @Override
    public void Register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);
    }

    /*
     * �����н��ߵĺ��ķ���:
     * 1.���ݵõ�����Ϣ��ɶ�Ӧ����;
     * 2.�н��������������Э�����������ͬ�¶����������;
     */
    @Override
    public void GetMessage(int stateChange, String colleagueName) {
        //�������ӷ�������Ϣ
        if (colleagueMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine) colleagueMap.get("coffeeMachine")).StartCoffee();
                ((Curtains) colleagueMap.get("curtains")).DownCurtains();
                ((TV) colleagueMap.get("tv")).StartTv();
            } else if (stateChange == 1) {
                //���ӹر�ʱ�Ķ���
            }
        //�����Ȼ���������Ϣ
        } else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
            //����ǿ��Ȼ���������Ϣ,���ﴦ��...
            if (stateChange == 0) {
                //���Ȼ�����ʱ�Ķ���
            } else if (stateChange == 1) {
                ((TV) colleagueMap.get("tv")).PauseTv();
            }
        //������ӻ���������Ϣ
        } else if (colleagueMap.get(colleagueName) instanceof TV) {
            //����ǵ��ӻ���������Ϣ,���ﴦ��...
            if (stateChange == 0) {
                //���ӻ�����ʱ�Ķ���
            } else if (stateChange == 1) {
                ((Curtains) colleagueMap.get("curtains")).UpCurtains();
            }
        //��������������Ϣ
        } else if (colleagueMap.get(colleagueName) instanceof Curtains) {
            //����Ǵ�����������Ϣ,���ﴦ��...
        }
    }

}