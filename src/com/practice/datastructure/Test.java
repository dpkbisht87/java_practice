package com.practice.datastructure;

import java.util.*;

public class Test {

    public static void main(String[] args) {
//        List<String> ingredients = new ArrayList<>(Arrays.asList("strawberry", "banana", "pineapple", "mango", "peach", "honey"));
//        System.out.println(ingredients);
//        String s1 = "Classic,-strawberry";
//        String[] values = s1.split(",");
//
//        List<String> avoidIngred =ingredients.subList(1, ingredients.size());
//        System.out.println(avoidIngred);
//        System.out.println(values[0] + values[1]);
//        Map<String, List<String>> menu = new HashMap<>();
//        menu.put("Classic", new ArrayList<>(Arrays.asList("strawberry", "banana", "pineapple", "mango", "peach", "honey")));
//        menu.put("Freezie", new ArrayList<>(Arrays.asList("blackberry", "blueberry", "black currant", "grape juice", "frozen yogurt")));
//        menu.put("Greenie", new ArrayList<>(Arrays.asList("green apple", "lime", "avocado", "spinach", "ice", "apple juice")));
//        menu.put("Just Desserts", new ArrayList<>(Arrays.asList("banana", "ice cream", "chocolate", "peanut", "cherry")));
//        Set<String> fetchedIngred = menu.keySet();
//        List<String> fetchList = new ArrayList<>(fetchedIngred);
//        Collections.sort(fetchList);
//        System.out.println(fetchedIngred);
//        System.out.println(fetchList);
//        System.out.println(menu.keySet());
        String order = "-banana,-honey,-mango,peach,pineapple,strawberry";
        String[] orderList = order.split(",");
        System.out.println(orderList.length);
//        l1.replaceAll((element) -> element.toUpperCase(Locale.ROOT));

        List<String> avoidIngred = Arrays.asList(orderList).subList(1, orderList.length);
        System.out.println(avoidIngred);

    }
}
