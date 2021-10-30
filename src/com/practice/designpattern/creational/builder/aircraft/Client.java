package com.practice.designpattern.creational.builder.aircraft;

import com.practice.designpattern.creational.builder.aircraft.F16.F16Builder;

public class Client {

    public void main(){
        F16Builder f16Builder = new F16Builder();
        Director director = new Director(f16Builder);
        director.construct(false);
    }
}
