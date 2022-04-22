package com.lixin.builder.improve;

public class CommonHouse extends HouseBuilder {

	@Override
	public void buildBasic() {
		super.house.setBasic("5m");
		System.out.println("普通房子打地基5米");
	}

	@Override
	public void buildWalls() {
		super.house.setWall("10cm");
		System.out.println("普通房子砌墙10cm");
	}

	@Override
	public void roofed() {
		super.house.setRoofed("普通房顶");
		System.out.println("普通房子屋顶");
	}

}
