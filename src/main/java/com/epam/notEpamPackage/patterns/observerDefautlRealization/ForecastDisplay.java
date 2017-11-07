package com.epam.notEpamPackage.patterns.observerDefautlRealization;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, Display {
    Observable observable;
    private float previousBarometr;
    private float pressure;
    private boolean isClear;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.pressure = weatherData.getPressure();
            isClear = (previousBarometr <= pressure) ? true : false;
            previousBarometr = pressure;
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("---THE FORECAST:---");
        if (isClear) {
            System.out.println("It will be clear");
        } else {
            System.out.println("It will be rainy. Don`t forget the umbrella!");
        }
    }
}
