package com.home.patterns.observer;

public class TemperatureIndex implements Observer, DisplayElements {
    private float heatIndex;
    HeatIndex temperatureIndex = new HeatIndex();

    @Override
    public void update(float temperature, float humidity, float pressure) {
        heatIndex = temperatureIndex.computeHeatIndex(temperature, humidity);
        display();
    }

    @Override
    public void display() {
        System.out.println("---HEAT INDEX: " + heatIndex + "---");
    }
}
