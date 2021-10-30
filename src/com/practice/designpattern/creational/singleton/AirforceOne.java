package com.practice.designpattern.creational.singleton;

public class AirforceOne {
    private static AirforceOne onlyInstance;
    private AirforceOne(){
    }

    public void fly(){
        System.out.println("Airforce One is flying...");
    }
    public static AirforceOne getInstance(){
        if (onlyInstance == null){
            onlyInstance = new AirforceOne();
        }
        return onlyInstance;
    }
}

