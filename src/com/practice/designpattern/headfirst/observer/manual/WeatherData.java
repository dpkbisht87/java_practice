package com.practice.designpattern.headfirst.observer.manual;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements  Subject{
    List<Observer> observerArrayList;
    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherData(){
        observerArrayList = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observerArrayList.add(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer o: observerArrayList){
            o.update(temperature, humidity, pressure);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observerArrayList.indexOf(o);
        if(index != -1){
            observerArrayList.remove(index);
        }
    }

    public void measurementChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
