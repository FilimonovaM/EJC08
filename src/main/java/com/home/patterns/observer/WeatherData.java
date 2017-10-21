package com.home.patterns.observer;

import java.util.*;

public class WeatherData implements Subject{
    private ArrayList observers;
    private float temperature;
    private float pressure;
    private float humidity;
    WeatherData(){
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        observers.remove(i);
    }

    @Override
    public void notifyObservers() {
        for(int i = 0; i<observers.size(); i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurmentsChanged(){
        notifyObservers();
    }

    public void setMeasurments(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurmentsChanged();
    }
}
