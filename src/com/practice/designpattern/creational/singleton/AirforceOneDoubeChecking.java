package com.practice.designpattern.creational.singleton;

public class AirforceOneDoubeChecking {
    private volatile static AirforceOneDoubeChecking onlyInstance;

    private AirforceOneDoubeChecking(){}

    public static synchronized AirforceOneDoubeChecking getInstance(){
        if (onlyInstance == null){
            synchronized (AirforceOneDoubeChecking.class){
                if(onlyInstance == null){
                    onlyInstance = new AirforceOneDoubeChecking();
                }
            }
        }
        return onlyInstance;
    }
}
