package com.practice.designpattern.creational.builder.aircraft.F16;

import com.practice.designpattern.creational.builder.aircraft.AircraftBuilder;

public class F16Builder extends AircraftBuilder {
    F16 f16;
    @Override
    public void buildCockpit() {
//        f16.cockPit = new F16Cockpit();
    }

    @Override
    public void buildWings() {
//        f16.wings = new F16Wings();
    }

    @Override
    public void buildEngine() {
//        f16.engine = new F16Engine();
    }
}
