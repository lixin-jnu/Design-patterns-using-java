package com.lixin.visitor;

//∂‘œÛMan¿‡
public class Man extends Person {

	@Override
	public void accept(Action action) {
		action.getManResult(this);
	}

}