package com.cydeo.java9;

import java.util.*;

public class FactoryMethodsDemo {

    public static void main(String[] args) {

        // Creating unmodifiable List BEFORE Java 9
        System.out.println("Creating unmodifiable List before Java 9");

        List<String> courses = Collections.unmodifiableList(Arrays.asList("Java", "Spring", "Agile"));
        System.out.println(courses);
        System.out.println("---------------------");

        // Creating unmodifiable List AFTER Java 9 - read only
        System.out.println("Creating unmodifiable List AFTER Java 9");
        List<String> myCourses = List.of("Java", "Spring", "Agile");
        System.out.println(myCourses);

        // Creating unmodifiable Set AFTER Java 9 - read only
        Set<String> myProduct = Set.of("Milk", "Bread", "Butter");
        System.out.println(myProduct);

        // Creating unmodifiable Map AFTER Java 9 - read only
        Map<String, Integer> myCart = Map.ofEntries(
                Map.entry("Samsung", 1),
                Map.entry("PSP", 1),
                Map.entry("Chair", 3)

        );
        System.out.println(myCart);



    }
}
