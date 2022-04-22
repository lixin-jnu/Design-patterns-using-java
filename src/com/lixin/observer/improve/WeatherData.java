package com.lixin.observer.improve;

import java.util.ArrayList;

/**
 * 1.包含最新的天气情况信息;
 * 2.含有观察者Observer集合,使用ArrayList来管理;
 * 3.当天气数据有更新时,就主动通知所有的接入方,可以看到最新的天气信息;
 */

public class WeatherData implements Subject {

	private float temperature;
	private float pressure;
	private float humidity;
	private ArrayList<Observer> observers;//观察者集合

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

	//注册一个观察者
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	//移除一个观察者
	@Override
	public void removeObserver(Observer o) {
		if(observers.contains(o)) {
			observers.remove(o);
		}
	}

	//一旦天气数据更新->立刻通知各个观察者
	public void setData(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		notifyObservers();
	}

	//遍历所有的观察者并通知
	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(getTemperature(), getPressure(), getHumidity());
		}
	}

}