package com.lixin.observer.improve;

public class BaiduSite implements Observer {

	//�¶�+��ѹ+ʪ��
	private float temperature;
	private float pressure;
	private float humidity;

	//�����������
	public void update(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		display();
	}

	//��ʾ�������
	public void display() {
		System.out.println("***�ٶ���վ-���� : " + temperature + "***");
		System.out.println("***�ٶ���վ-��ѹ: " + pressure + "***");
		System.out.println("***�ٶ���վ-ʪ��: " + humidity + "***");
	}

}