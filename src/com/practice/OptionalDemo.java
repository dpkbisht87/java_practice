package com.practice;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String[] str = new String[10];
        str[5] = "Hello world";
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        if (checkNull.isPresent() ){
            String tempStr = str[5].toLowerCase();
            System.out.println(tempStr);
        }
        else {
            System.out.println("string value is not present");
        }
    }
}
