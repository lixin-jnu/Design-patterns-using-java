package com.lixin.memento.theory;

public class Originator {

	private String state;//状态信息

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	//编写一个方法,可以保存Originator对象当前的状态->Memento
	public Memento saveStateToMemento() {
		return new Memento(state);
	}
	
	//通过备忘录对象,恢复状态
	public void getStateFromMemento(Memento memento) {
		state = memento.getState();
	}

}