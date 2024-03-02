package com.cydeo;

import com.cydeo.dishTask.Dish;
import com.cydeo.dishTask.DishData;
import com.cydeo.dishTask.Type;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 6, 7);

        // ----- .toCollection(Supplier) : is used to create a Collection using Collector
        System.out.println("----- .toCollection() -----");
        List<Integer> numberList = numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numberList);

        Set<Integer> numberSet = numbers.stream()
                .filter(z -> z%2 == 0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);

        // ----- .toList() : returns a Collector interface that gathers the input data into a new List
        System.out.println("----- .toList() -----");
        List<Integer> numberList1 =numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.toList());
        System.out.println(numberList1);

        // ----- .toSet() : returns a Collector interface that gathers the input data into a new Set
        System.out.println("----- .toSet() -----");
        Set<Integer> numberSet1 =numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.toSet());
        System.out.println(numberSet1);

        // ----- .toMap() : returns a Collector interface that gathers the input data into a new Map
        System.out.println("----- .toMap() -----");
        Map<String, Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));
        System.out.println(dishMap);

        // ----- .summingInt() : returns a Collector that Produces the sum of an Integer-valued function
        System.out.println("----- .summingInt() -----");
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories)); // .mapToInt(Dish::getCalories).sum();
        System.out.println(sum);

        // ----- .counting() : returns a Collector that counts the number of the elements
        System.out.println("----- .counting() -----");
        Long evenCount = numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.counting()); // .count()
        System.out.println(evenCount);

        // ----- .averagingInt() : returns average of the integers passed values
        System.out.println("----- .averagingInt() -----");
        Double calAverage = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(calAverage);

        // ----- .joining() : used to join various elements of a char or String array into a single objects
        System.out.println("----- .joining() -----");
        List<String> courses = Arrays.asList("Java", "JS", "TS");
        String str = courses.stream()
                .collect(Collectors.joining(", "));
        System.out.println(str);

        // ----- .partitioningBy() : partition a stream of objects/set of elements based on a given Predicate
        System.out.println("----- .partitioningBy() -----");
        Map<Boolean, List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(veggieDish);

        // ----- .groupingBy() : groping objects by some property and storing results in a Map instance
        System.out.println("----- .groupingBy() -----");
        Map<Type, List<Dish>> dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);

    }
}
