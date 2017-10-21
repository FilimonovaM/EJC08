package com.home.patterns.observer;

public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsElement currentConditionsElement = new CurrentConditionsElement(weatherData);
        weatherData.registerObserver(currentConditionsElement);
        weatherData.setMeasurments(10,10,10);

    }
}
