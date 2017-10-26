package com.notEpamPackage.patterns.observerTheMainRealization;

public class TemperatureIndex implements Observer, DisplayElements {
    private float heatIndex;
    HeatIndex temperatureIndex = new HeatIndex();

    /**
     * uses for updating of weather information & finding the heat index.
     *
     * @param temperature - is a new temperature
     * @param humidity    - is a new humidity
     * @param pressure    - is not uses here
     */
    @Override
    public void update(float temperature, float humidity, float pressure) {
        heatIndex = temperatureIndex.computeHeatIndex(temperature, humidity);
        display();
    }

    /**
     * uses to show a new value of heat index.
     */
    @Override
    public void display() {
        System.out.println("---HEAT INDEX: " + heatIndex + "---");
    }
}
