package com.practice;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner joinNames = new StringJoiner(", ", "[", "]");
        joinNames.add("Rahul");
        joinNames.add("Deepak");
        joinNames.add("Priyanka");
        joinNames.add("Bipin");
        joinNames.add("Rajesh");

        System.out.println(joinNames.toString());
    }
}
