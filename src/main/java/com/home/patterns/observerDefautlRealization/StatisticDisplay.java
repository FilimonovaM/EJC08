package com.home.patterns.observerDefautlRealization;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class StatisticDisplay implements Observer, Display {
    Observable observable;
    ArrayList<float[]> statistic;
    float[] statisticData;
    private float temperature;
    private float humidity;
    private float pressure;
    private float maxTemperature, minTemperature;
    private float maxHumidity, minHumidity;
    private float maxPressure, minPressure;

    public StatisticDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
        statistic = new ArrayList<>();
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            createStatistic();
            display();
        }

    }

    private void createStatistic(){
        statisticData = new float[]{temperature, humidity, pressure};
        statistic.add(statisticData);
        setMaxMinTemperature();
        setMaxMinHumidity();
        setMaxMinPressure();

    }

    /**
     * uses to calculate max & min values of temperature.
     */
    private void setMaxMinTemperature() {
        int i = 0;
        minTemperature = statistic.get(0)[0];
        for (float[] j : statistic) {
            maxTemperature = (statistic.get(i)[0] > maxTemperature) ? statistic.get(i)[0] : maxTemperature;
            minTemperature = (statistic.get(i)[0] < minTemperature) ? statistic.get(i)[0] : minTemperature;
            i++;
        }
    }

    /**
     * uses to calculate max & min values of humidity.
     */
    private void setMaxMinHumidity() {
        int i = 0;
        minHumidity = statistic.get(0)[1];
        for (float[] j : statistic) {
            maxHumidity = (statistic.get(i)[1] > maxHumidity) ? statistic.get(i)[1] : maxHumidity;
            minHumidity = (statistic.get(i)[1] < minHumidity) ? statistic.get(i)[1] : minHumidity;
            i++;
        }
    }

    /**
     * uses to calculate max & min values of pressure.
     */
    private void setMaxMinPressure() {
        int i = 0;
        minPressure = statistic.get(0)[2];
        for (float[] f : statistic) {
            maxPressure = (statistic.get(i)[2] > maxPressure) ? statistic.get(i)[2] : maxPressure;
            minPressure = (statistic.get(i)[2] < minPressure) ? statistic.get(i)[2] : minPressure;
            i++;
        }
    }

    /**
     * uses to show new statistics of max & min values of pressure, temperature & humidity.
     */
    @Override
    public void display() {
        System.out.println("---STATISTICS:---\nMaxTemperature = " + maxTemperature + "\n" +
                "MaxHumidity = " + maxHumidity + "\nMaxPressure = " + maxPressure + "\nMinTemperature = "
                + minTemperature + "\n" + "MinHumidity = " + minHumidity + "\nMinPressure = " + minPressure);
    }
}
