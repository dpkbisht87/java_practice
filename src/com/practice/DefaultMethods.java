package com.practice;

interface Sayable{
    default void say(){
        System.out.println("This is the default method");
    }
}
public class DefaultMethods implements  Sayable{
    public void sayMore(){
        System.out.println("Work is worship");
    }

    public static void main(String[] args) {
        DefaultMethods s = new DefaultMethods();
        s.say();
        s.sayMore();
    }
}
