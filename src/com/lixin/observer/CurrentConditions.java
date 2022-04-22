package com.lixin.observer;

/**
 * ��ʾ��ǰ�������(��������������վ�Լ�����վ);
 */

public class CurrentConditions {

	//�¶�+��ѹ+ʪ��
	private float temperature;
	private float pressure;
	private float humidity;

	//�����������,����WeatherData������(����ģʽ)
	public void update(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		display();
	}

	//��ʾ
	public void display() {
		System.out.println("***Today mTemperature: " + temperature + "***");
		System.out.println("***Today mPressure: " + pressure + "***");
		System.out.println("***Today mHumidity: " + humidity + "***");
	}

}