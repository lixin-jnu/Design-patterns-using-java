package com.lixin.memento.game;

//�ػ��߶���,������Ϸ��ɫ��״̬
public class Caretaker {

	//1.���ֻ����һ��״̬
	private Memento memento;
	//2.��GameRole������״̬
	//private ArrayList<Memento> mementos;
	//3.�Զ����Ϸ��ɫ������״̬
	//private HashMap<String, ArrayList<Memento>> rolesMementos;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}

}