package com.interview.design.observer;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}


class WeatherData implements Subject{

    private float temperature;
    private float humidity;
    private float pressure;
    private List<Observer> observerList;

    public WeatherData() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
//        observerList.remove(observer);
        int i = observerList.indexOf(observer);
        if (i >= 0)
            observerList.remove(i);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.pressure = pressure;
        this.humidity = humidity;
        this.temperature = temperature;
        measurementChanged();
    }
}
