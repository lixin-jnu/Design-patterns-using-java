package com.lixin.memento.theory;

public class Originator {

	private String state;//״̬��Ϣ

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	//��дһ������,���Ա���Originator����ǰ��״̬->Memento
	public Memento saveStateToMemento() {
		return new Memento(state);
	}
	
	//ͨ������¼����,�ָ�״̬
	public void getStateFromMemento(Memento memento) {
		state = memento.getState();
	}

}