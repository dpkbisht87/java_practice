package com.practice.designpattern.creational.builder.aircraft.Boeing747;

import com.practice.designpattern.creational.builder.aircraft.AircraftBuilder;

public class Boeing747Builder extends AircraftBuilder {

    Boeing747 boeing747;

    @Override
    public void buildCockpit() {
//        boeing747.cockPit = new Boeing747CockPit();
    }

    @Override
    public void buildWings() {
//        boeing747.wings = new Boeing747Wings();
    }

    @Override
    public void buildEngine() {
//        boeing747.engine = new Boeing747Engine();
    }

    @Override
    public void buildBathroom() {
//        boeing747.bathroom = new Boeing747Bathroom();
    }
}
