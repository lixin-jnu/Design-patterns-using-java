package com.lixin.memento.theory;

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("1-������100");
        caretaker.add(originator.saveStateToMemento());
        originator.setState("2-������80");
        caretaker.add(originator.saveStateToMemento());
        originator.setState("3-������50");
        caretaker.add(originator.saveStateToMemento());
        System.out.println("��ǰ��״̬��=" + originator.getState());
        //ϣ���õ�״̬1->��originator�ָ���״̬1
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("��ǰ��״̬��=" + originator.getState());
    }

}