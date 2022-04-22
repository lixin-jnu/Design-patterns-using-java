package com.lixin.memento.theory;

public class Memento {

	private String state;

	//¹¹ÔìÆ÷
	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

}