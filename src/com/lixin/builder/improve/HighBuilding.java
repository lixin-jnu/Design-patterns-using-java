package com.lixin.builder.improve;

public class HighBuilding extends HouseBuilder {

	@Override
	public void buildBasic() {
		super.house.setBasic("100m");
		System.out.println("��¥�Ĵ�ػ�100��");
	}

	@Override
	public void buildWalls() {
		super.house.setWall("20cm");
		System.out.println("��¥����ǽ20cm");
	}

	@Override
	public void roofed() {
		super.house.setRoofed("͸������");
		System.out.println("��¥��͸���ݶ�");
	}

}
