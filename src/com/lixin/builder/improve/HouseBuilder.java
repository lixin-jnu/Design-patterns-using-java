package com.lixin.builder.improve;

//����Ľ�����
public abstract class HouseBuilder {

	protected House house = new House();
	
	//�����������д��,����ķ���
	public abstract void buildBasic();

	public abstract void buildWalls();

	public abstract void roofed();
	
	//���췿�����,����Ʒ(����)����
	public House buildHouse() {
		return house;
	}
	
}