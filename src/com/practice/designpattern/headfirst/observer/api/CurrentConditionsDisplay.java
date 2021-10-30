package com.practice.designpattern.headfirst.observer.api;


import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer {
    private float temperature;
    private float pressure;
    private float humidity;
    Observable observable;

    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    private void display() {
        System.out.println("Current Conditions: "+ temperature + " : " + humidity + " : " + pressure);
    }
}
