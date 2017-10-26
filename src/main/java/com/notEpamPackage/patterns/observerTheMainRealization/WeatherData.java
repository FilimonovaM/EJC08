package com.notEpamPackage.patterns.observerTheMainRealization;

import java.util.*;

public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float pressure;
    private float humidity;

    WeatherData() {
        observers = new ArrayList();
    }

    /**
     * uses for registration of the new observers.
     *
     * @param observer - added observerTheMainRealization
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    /**
     * uses for removing of observers.
     *
     * @param observer - removing observerTheMainRealization
     */
    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        observers.remove(i);
    }

    /**
     * uses to update information for all observers.
     */
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * uses to call the observerTheMainRealization`s updating.
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * uses to set a new values of temperature, humidity, pressure.
     *
     * @param temperature - new value of temperature
     * @param humidity    - new value of humidity
     * @param pressure    -new value of pressure
     */
    public void setMeasurments(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
