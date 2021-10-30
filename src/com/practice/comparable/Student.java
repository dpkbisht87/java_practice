package com.practice.comparable;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student s) {
        return Integer.compare(age, s.age);
    }
}
