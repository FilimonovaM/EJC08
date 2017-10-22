package com.home.patterns.observer;

public class WeatherForecast implements Observer, DisplayElements {
    float previousBarometr;
    boolean isClear;

    /**
     *uses to update a status of param isClear.
     *
     * @param temperature - not uses here
     * @param humidity - not uses here
     * @param pressure - is a new pressure, uses to create the prediction
     */
    @Override
    public void update(float temperature, float humidity, float pressure) {
        isClear = (previousBarometr <= pressure) ? true : false;
        previousBarometr = pressure;
        display();
    }

    /**
     *uses to predict a rain & show it.
     *
     */
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
