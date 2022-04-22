package com.lixin.builder.improve;

//指挥者,这里去指定制作流程,返回产品
public class HouseDirector {
	
	HouseBuilder houseBuilder = null;

	//构造器传入houseBuilder
	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	//通过setter方法传入houseBuilder
	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	
	//房子的建造流程交给指挥者决定
	public House constructHouse() {
		houseBuilder.buildBasic();
		houseBuilder.buildWalls();
		houseBuilder.roofed();
		return houseBuilder.buildHouse();
	}

}