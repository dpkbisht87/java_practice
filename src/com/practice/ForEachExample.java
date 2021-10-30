package com.practice;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> gamesList = new ArrayList<>();
        gamesList.add("Cricket");
        gamesList.add("FootBall");
        gamesList.add("Badminton");
        gamesList.add("Skiing");


        for(String game : gamesList){
            System.out.println(game);
        }

        // Using for each
        gamesList.forEach(game -> System.out.println(game));
        // Using method reference
        gamesList.forEach(System.out::println);

        // Using ForEachOrdered
        gamesList.stream().forEachOrdered(System.out::println);
    }
}
