package com.practice.designpattern.headfirst.observer.manual;

public class CurrentConditionsDisplay implements  Observer, DisplayElement{
    private float temperature;
    private float pressure;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);

    }
    @Override
    public void display() {
        System.out.println("Current Conditions: "+ temperature + " : " + humidity + " : " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
