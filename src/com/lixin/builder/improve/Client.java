package com.lixin.builder.improve;

public class Client {

	public static void main(String[] args) {
		//����ͨ����
		CommonHouse commonHouse = new CommonHouse();
		//׼����ͨ���ӵ�ָ����
		HouseDirector houseDirector = new HouseDirector(commonHouse);
		//��ɸǷ���,���ز�Ʒ(��ͨ����)
		House house = houseDirector.constructHouse();
		System.out.println(house.toString());
		System.out.println("--------------------------");
		//�Ǹ�¥
		HighBuilding highBuilding = new HighBuilding();
		//����ָ����
		houseDirector.setHouseBuilder(highBuilding);
		//��ɸǷ���,���ز�Ʒ(��¥)
		System.out.println(houseDirector.constructHouse().toString());
	}

}