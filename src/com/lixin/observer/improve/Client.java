package com.lixin.observer.improve;

public class Client {

	public static void main(String[] args) {
		//创建一个WeatherData气象站
		WeatherData weatherData = new WeatherData();
		//创建许多观察者
		CurrentConditions currentConditions = new CurrentConditions();
		BaiduSite baiduSite = new BaiduSite();
		//注册到weatherData
		weatherData.registerObserver(currentConditions);
		weatherData.registerObserver(baiduSite);//拓展删除非常的方便
		//测试
		weatherData.setData(10f, 100f, 30.3f);
		//移除一个观察者
		weatherData.removeObserver(currentConditions);
		//测试
		weatherData.setData(15f, 150f, 40.1f);
	}

}