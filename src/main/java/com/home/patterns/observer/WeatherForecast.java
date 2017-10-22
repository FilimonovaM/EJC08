package com.home.patterns.observer;

import java.util.ArrayList;

public class WeatherForecast implements Observer, DisplayElements {
    float previousBarometr;
    boolean isClear;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        isClear = (previousBarometr <= pressure) ? true : false;
        previousBarometr = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("---THE FORECAST:---");
        if (isClear) {
            System.out.println("It will be clear");
        } else {
            System.out.println("It will be rainy. Don`t forget an umbrella!");
        }
    }
}
