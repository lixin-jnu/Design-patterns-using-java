package com.lixin.builder.improve;

public class HighBuilding extends HouseBuilder {

	@Override
	public void buildBasic() {
		super.house.setBasic("100m");
		System.out.println("高楼的打地基100米");
	}

	@Override
	public void buildWalls() {
		super.house.setWall("20cm");
		System.out.println("高楼的砌墙20cm");
	}

	@Override
	public void roofed() {
		super.house.setRoofed("透明房顶");
		System.out.println("高楼的透明屋顶");
	}

}
