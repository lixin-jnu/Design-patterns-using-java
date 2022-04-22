package com.lixin.observer.improve;

public class Client {

	public static void main(String[] args) {
		//����һ��WeatherData����վ
		WeatherData weatherData = new WeatherData();
		//�������۲���
		CurrentConditions currentConditions = new CurrentConditions();
		BaiduSite baiduSite = new BaiduSite();
		//ע�ᵽweatherData
		weatherData.registerObserver(currentConditions);
		weatherData.registerObserver(baiduSite);//��չɾ���ǳ��ķ���
		//����
		weatherData.setData(10f, 100f, 30.3f);
		//�Ƴ�һ���۲���
		weatherData.removeObserver(currentConditions);
		//����
		weatherData.setData(15f, 150f, 40.1f);
	}

}