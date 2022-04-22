package com.lixin.builder.improve;

public class CommonHouse extends HouseBuilder {

	@Override
	public void buildBasic() {
		super.house.setBasic("5m");
		System.out.println("��ͨ���Ӵ�ػ�5��");
	}

	@Override
	public void buildWalls() {
		super.house.setWall("10cm");
		System.out.println("��ͨ������ǽ10cm");
	}

	@Override
	public void roofed() {
		super.house.setRoofed("��ͨ����");
		System.out.println("��ͨ�����ݶ�");
	}

}
