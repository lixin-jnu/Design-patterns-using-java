package com.lixin.observer.improve;

public class BaiduSite implements Observer {

	//温度+气压+湿度
	private float temperature;
	private float pressure;
	private float humidity;

	//更新天气情况
	public void update(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		display();
	}

	//显示天气情况
	public void display() {
		System.out.println("***百度网站-气温 : " + temperature + "***");
		System.out.println("***百度网站-气压: " + pressure + "***");
		System.out.println("***百度网站-湿度: " + humidity + "***");
	}

}