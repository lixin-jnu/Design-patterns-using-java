package com.lixin.builder.improve;

//ָ����,����ȥָ����������,���ز�Ʒ
public class HouseDirector {
	
	HouseBuilder houseBuilder = null;

	//����������houseBuilder
	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	//ͨ��setter��������houseBuilder
	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	
	//���ӵĽ������̽���ָ���߾���
	public House constructHouse() {
		houseBuilder.buildBasic();
		houseBuilder.buildWalls();
		houseBuilder.roofed();
		return houseBuilder.buildHouse();
	}

}