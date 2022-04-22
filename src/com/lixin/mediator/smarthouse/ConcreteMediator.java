package com.lixin.mediator.smarthouse;

import java.util.HashMap;

//具体的中介者类
public class ConcreteMediator extends Mediator {

    //集合,放入所有的同事对象
    private HashMap<String, Colleague> colleagueMap;

    public ConcreteMediator() {
        colleagueMap = new HashMap<>();
    }

    @Override
    public void Register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);
    }

    /*
     * 具体中介者的核心方法:
     * 1.根据得到的消息完成对应任务;
     * 2.中介者在这个方法中协调各个具体的同事对象完成任务;
     */
    @Override
    public void GetMessage(int stateChange, String colleagueName) {
        //处理闹钟发出的消息
        if (colleagueMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine) colleagueMap.get("coffeeMachine")).StartCoffee();
                ((Curtains) colleagueMap.get("curtains")).DownCurtains();
                ((TV) colleagueMap.get("tv")).StartTv();
            } else if (stateChange == 1) {
                //闹钟关闭时的动作
            }
        //处理咖啡机发出的消息
        } else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
            //如果是咖啡机发出的消息,这里处理...
            if (stateChange == 0) {
                //咖啡机开启时的动作
            } else if (stateChange == 1) {
                ((TV) colleagueMap.get("tv")).PauseTv();
            }
        //处理电视机发出的消息
        } else if (colleagueMap.get(colleagueName) instanceof TV) {
            //如果是电视机发出的消息,这里处理...
            if (stateChange == 0) {
                //电视机开启时的动作
            } else if (stateChange == 1) {
                ((Curtains) colleagueMap.get("curtains")).UpCurtains();
            }
        //处理窗帘发出的消息
        } else if (colleagueMap.get(colleagueName) instanceof Curtains) {
            //如果是窗帘发出的消息,这里处理...
        }
    }

}