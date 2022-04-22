package com.lixin.observer.improve;

import java.util.ArrayList;

/**
 * 1.�������µ����������Ϣ;
 * 2.���й۲���Observer����,ʹ��ArrayList������;
 * 3.�����������и���ʱ,������֪ͨ���еĽ��뷽,���Կ������µ�������Ϣ;
 */

public class WeatherData implements Subject {

	private float temperature;
	private float pressure;
	private float humidity;
	private ArrayList<Observer> observers;//�۲��߼���

	public WeatherData() {
		observers = new ArrayList<>();
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

	//ע��һ���۲���
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	//�Ƴ�һ���۲���
	@Override
	public void removeObserver(Observer o) {
		if(observers.contains(o)) {
			observers.remove(o);
		}
	}

	//һ���������ݸ���->����֪ͨ�����۲���
	public void setData(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		notifyObservers();
	}

	//�������еĹ۲��߲�֪ͨ
	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(getTemperature(), getPressure(), getHumidity());
		}
	}

}