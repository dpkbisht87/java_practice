package com.practice.designpattern.headfirst.observer.manual;

public interface Subject {
    public void registerObserver(Observer o);
    public void notifyObserver();
    public void removeObserver(Observer o);
}
