package com.lixin.observer.improve;

//Subject�ӿ�,��WeatherData(����վ)��ʵ��
public interface Subject {
	
	public void registerObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyObservers();

}