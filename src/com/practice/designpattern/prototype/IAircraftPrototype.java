package com.practice.designpattern.prototype;

public interface IAircraftPrototype {
    void fly();
    IAircraftPrototype clone();
    void setEngine(F16Engine f16Engine);
}
