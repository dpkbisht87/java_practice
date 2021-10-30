package com.practice.designpattern.headfirst.observer.api;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherData(){}

    public void measurementChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure){
        this.temperature = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementChanged();
    }
    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
}
