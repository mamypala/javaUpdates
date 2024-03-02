package com.cydeo.dishTask;


import java.util.Comparator;

public class DishTest {

    public static void main(String[] args) {

        // Task 1:
        System.out.println("Task 1: dish's name that has less than 400 calories");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
                .map(Dish::getName)// .map(dish -> dish.getName())
                .forEach(System.out::println);
        System.out.println("---------------------");

        // Task 2:
        System.out.println("Task 2: the length of the name of dish");
        DishData.getAll().stream()
                .map(Dish::getName)
                .map(String::length)
                //.map(dish -> dish.getName().length())
                .forEach(System.out::println);
        System.out.println("---------------------");

        // Task 3:
        System.out.println("Task 3: three high caloric dish name");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() > 300)
                .limit(3)
                .map(Dish::getName)
                .forEach(System.out::println);
        System.out.println("---------------------");

        // Task 4:
        System.out.println("Task 4: all dish name that are below 400 calories in sorted");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);

    }
}
/*
Task:
1. Print all dish's name that has less than 400 calories.
2. Print the length of the name of dish
3. Print three high caloric dish name
4. Print all dish name that are below 400 calories in sorted
 */
