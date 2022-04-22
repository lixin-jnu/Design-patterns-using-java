package com.lixin.visitor;

//访问者Fail类
public class Fail extends Action {

	@Override
	public void getManResult(Man man) {
		System.out.println("男人评价该歌手失败!");
	}

	@Override
	public void getWomanResult(Woman woman) {
		System.out.println("女人评价该歌手失败!");
	}

}