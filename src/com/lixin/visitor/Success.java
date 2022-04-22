package com.lixin.visitor;

//访问者Success类
public class Success extends Action {

	@Override
	public void getManResult(Man man) {
		System.out.println("男人评价该歌手很成功!");
	}

	@Override
	public void getWomanResult(Woman woman) {
		System.out.println("女人评价该歌手很成功!");
	}

}