package com.lixin.observer.improve;

//Subject接口,让WeatherData(气象站)来实现
public interface Subject {
	
	public void registerObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyObservers();

}