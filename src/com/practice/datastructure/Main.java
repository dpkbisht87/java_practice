package com.practice.datastructure;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Main mainObj = new Main();

        // HASHMAP
        mainObj.hashMapUtils();

        // LIST
//        mainObj.arrayListUtils();

        // ARRAYLIST SORTING
//        mainObj.arrayListSorting();

        // HASHSET
//        mainObj.hashSetUtils();


    }

    public void hashSetUtils(){
        Set<Integer> set= new HashSet<>();
        set.add(23);
        set.add(24);
        set.add(25);
        set.add(25);
//        System.out.println(set);
        // foreach
        set.forEach(System.out::println);

        System.out.println(set.contains(23));
        System.out.println(set.isEmpty());

        // Sorting a set
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list);

        set.remove(24);
        set.clear();
    }

    public void arrayListSorting(){
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);
//        Collections.sort(list);
//        System.out.println(list);
        List sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
    }


    public void arrayListUtils(){
        List<String> l1 = Stream.of("xyz", "abc").collect(Collectors.toList());
        List<Integer> l2 = new ArrayList<>(Arrays.asList(1,2,3,4));

        int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String phone = String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
        System.out.println(phone);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println("The size of the List is  " + l1.size());
        System.out.println("The size of the array is  " + numbers.length);
        //Remove a particular element
//        l2.remove(Integer.valueOf(3));

        // Remove from particular index
//        l1.remove(1);

        //Remove all element within a range (Not available with list, use arraylist)/
        // arrayList.removeRange(start, end);

        // Replace all the elements
        l1.replaceAll((element) -> element.toUpperCase(Locale.ROOT));
        System.out.println(l1);

        //CHeck element
        if(l2.contains(3)){
            System.out.println("3 is present");
        }

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

//        for(int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//            list.remove(list.get(i));
//        }
        for(Integer item: list){
            System.out.println(item);
        }
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
//            iterator.remove();
        }
        System.out.println(list.toString());

        // Getting ListIterator
        ListIterator<Integer> listIterator = list.listIterator();

        // Traversing elements
        System.out.println("Forward Direction Iteration:");
        while (listIterator.hasNext()) {
            System.out.println("Next element is " + listIterator.next() +
                    " and next index is " + listIterator.nextIndex());

        }

        // Traversing elements, the iterator is at the end at this point
        System.out.println("Backward Direction Iteration:");
        while (listIterator.hasPrevious()) {
            System.out.println("Previous element is " + listIterator.previous() +
                    " and previous index is " + listIterator.previousIndex());
        }
    }


    public void hashMapUtils(){
        Map<String, String> mapDemo = new HashMap<>();
        mapDemo.put("Black", "White");
        mapDemo.put("Happy", "Sad");
        mapDemo.put("Day", "Night");

        //Entry Set
        for( Map.Entry<String, String> entry: mapDemo.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Iterator
        Iterator<Map.Entry<String, String>> iterator = mapDemo.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //Lambda
        mapDemo.forEach((key, value) -> System.out.println(key + " : " + value));

        //Stream
        mapDemo.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " : " + e.getValue() ));

        Map<String, Integer> stockPrice = new HashMap<>();

        stockPrice.put("Oracle", 56);
        stockPrice.put("Fiserv", 117);
        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);
        stockPrice.replace("Oracle", 50);

        // Remove by Key
        System.out.println(stockPrice.remove("Oracle"));

        // Check key exists
        System.out.println(stockPrice.containsKey("Oracle"));

        // Check value exists
        System.out.println(stockPrice.containsValue(73));

        // Fetch all keys
        System.out.println(stockPrice.keySet());

        // Fetch all values
        System.out.println(stockPrice.values());
        System.out.println(stockPrice);
    }
}
