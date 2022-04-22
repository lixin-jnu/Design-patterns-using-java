package com.lixin.observer;

/**
 * 1.包含最新的天气情况信息;
 * 2.含有接入方CurrentConditions对象(聚合);
 * 3.当天气数据有更新时,就主动调用CurrentConditions对象的update方法(含display方法),这样他们(接入方)就可以显示最新的信息;
 */

public class WeatherData {

	private float temperature;
	private float pressure;
	private float humidity;
	private CurrentConditions currentConditions;
	//存在的问题:加入新的第三方时很困难

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

	//当天气数据有更新时,就调用setData
	public void setData(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		//调用dataChange方法,将最新的天气信息推送给接入方currentConditions
		dataChange();
	}

	public void dataChange() {
		//调用接入方的update
		currentConditions.update(getTemperature(), getPressure(), getHumidity());
	}

}