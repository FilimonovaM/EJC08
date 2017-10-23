package com.home.patterns.observerTheMainRealization;

import java.util.ArrayList;

public class StatisticsOfWeather implements Observer, DisplayElements {
    ArrayList<float[]> statistic;
    float[] statisticData = new float[3];
    private float maxTemperature, minTemperature;
    private float maxHumidity, minHumidity;
    private float maxPressure, minPressure;

    StatisticsOfWeather() {
        statistic = new ArrayList<>();
    }

    /**
     *uses to update the statistics of weather information.
     *
     * @param temperature - is a new temperature
     * @param humidity - is a new humidity
     * @param pressure - is a new pressure
     */
    @Override
    public void update(float temperature, float humidity, float pressure) {
        statisticData = new float[]{temperature, humidity, pressure};
        statistic.add(statisticData);
        setMaxMinTemperature();
        setMaxMinHumidity();
        setMaxMinPressure();
        display();
    }

    /**
     *uses to calculate max & min values of temperature.
     *
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
     *uses to calculate max & min values of humidity.
     *
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
     *uses to calculate max & min values of pressure.
     *
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
     *uses to show new statistics of max & min values of pressure, temperature & humidity.
     *
     */
    @Override
    public void display() {
        System.out.println("---STATISTICS:---\nMaxTemperature = " + maxTemperature + "\n" +
                "MaxHumidity = " + maxHumidity + "\nMaxPressure = " + maxPressure + "\nMinTemperature = "
                + minTemperature + "\n" + "MinHumidity = " + minHumidity + "\nMinPressure = " + minPressure);
    }
}
