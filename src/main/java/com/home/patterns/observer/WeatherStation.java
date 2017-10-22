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
        weatherData.setMeasurments(10F, 60F, 760F);
        System.out.println();
        weatherData.setMeasurments(5F, 92F, 762F);
        System.out.println();
        weatherData.setMeasurments(22F, 90F, 758F);
    }
}
