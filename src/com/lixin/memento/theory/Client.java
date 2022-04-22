package com.lixin.memento.theory;

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("1-攻击力100");
        caretaker.add(originator.saveStateToMemento());
        originator.setState("2-攻击力80");
        caretaker.add(originator.saveStateToMemento());
        originator.setState("3-攻击力50");
        caretaker.add(originator.saveStateToMemento());
        System.out.println("当前的状态是=" + originator.getState());
        //希望得到状态1->将originator恢复到状态1
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("当前的状态是=" + originator.getState());
    }

}