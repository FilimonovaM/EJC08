package com.home.patterns.observer;

public class CurrentConditionsElement implements Observer, DisplayElements {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

//    public CurrentConditionsElement(Subject weatherData){
//        this.weatherData = weatherData;
//    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("---CURRENT CONDITIONS:---\n" + temperature + "F degrees.\n" + humidity + " percents of humidity\n"
                + pressure + " mm. of pressure");
    }
}
