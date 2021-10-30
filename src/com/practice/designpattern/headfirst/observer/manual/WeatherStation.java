package com.practice.designpattern.headfirst.observer.manual;

public class WeatherStation {
    public static void main(String[] args) {
            WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 39);
        weatherData.setMeasurements(82, 61, 35);

    }
}
