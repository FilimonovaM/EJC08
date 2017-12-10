package com.epam.notEpamPackage.patterns.observerDefautlRealization;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        GeneralDisplay generalDisplay = new GeneralDisplay(weatherData);
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(10F, 10F, 10F);
        weatherData.notifyObservers();
        System.out.println();
        weatherData.setMeasurements(15F, 15F, 10F);
        weatherData.notifyObservers();
    }
}
