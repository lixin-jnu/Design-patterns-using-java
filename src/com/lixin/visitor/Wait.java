package com.lixin.visitor;

//访问者Wait类:拓展时十分方便,不需要修改对象结构,也不会"污染"对象
public class Wait extends Action {

	@Override
	public void getManResult(Man man) {
		System.out.println("男人评价该歌手待定..");
	}

	@Override
	public void getWomanResult(Woman woman) {
		System.out.println("女人评价该歌手待定..");
	}

}