package com.home.patterns.observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsElement currentConditionsElement = new CurrentConditionsElement();
        StatisticsOfWeather statisticsOfWeather = new StatisticsOfWeather();
        WeatherForecast weatherForecast = new WeatherForecast();
        weatherData.registerObserver(currentConditionsElement);
        weatherData.registerObserver(statisticsOfWeather);
        weatherData.registerObserver(weatherForecast);
        weatherData.setMeasurments(10, 10, 10);
        System.out.println();
        weatherData.setMeasurments(5, 15, 17);
        System.out.println();
        weatherData.setMeasurments(22, 1, 7);
    }
}
