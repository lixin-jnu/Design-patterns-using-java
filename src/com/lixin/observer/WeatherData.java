package com.lixin.observer;

/**
 * 1.�������µ����������Ϣ;
 * 2.���н��뷽CurrentConditions����(�ۺ�);
 * 3.�����������и���ʱ,����������CurrentConditions�����update����(��display����),��������(���뷽)�Ϳ�����ʾ���µ���Ϣ;
 */

public class WeatherData {

	private float temperature;
	private float pressure;
	private float humidity;
	private CurrentConditions currentConditions;
	//���ڵ�����:�����µĵ�����ʱ������

	public WeatherData(CurrentConditions currentConditions) {
		this.currentConditions = currentConditions;
	}

	public float getTemperature() {
		return temperature;
	}

	public float getPressure() {
		return pressure;
	}

	public float getHumidity() {
		return humidity;
	}

	//�����������и���ʱ,�͵���setData
	public void setData(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		//����dataChange����,�����µ�������Ϣ���͸����뷽currentConditions
		dataChange();
	}

	public void dataChange() {
		//���ý��뷽��update
		currentConditions.update(getTemperature(), getPressure(), getHumidity());
	}

}