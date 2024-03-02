package com.cydeo;

import com.cydeo.dishTask.Dish;
import com.cydeo.dishTask.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindMatching {

    public static void main(String[] args) {

        // .allMatch()
        System.out.println("----- .allMatch() -----");
        boolean isHealthy = DishData.getAll().stream()
                .allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy);

        // .anyMatch()
        System.out.println("----- .anyMatch() -----");
        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }

        // .noneMatch()
        System.out.println("----- .noneMatch() -----");
        boolean isHealthy1 = DishData.getAll().stream()
                .noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(isHealthy1);

        // .findAny()
        System.out.println("----- .findAny() -----");
        Optional<Dish> dish = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println(dish.get());

        // .findFirst()
        System.out.println("----- .findFirst() -----");
        Optional<Dish> dish1 = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println(dish1.get());

        // PARALLEL STREAMS (Async)
        System.out.println(IntStream.range(0,100).parallel().findAny());
        System.out.println(IntStream.range(0,100).parallel().findFirst());

        System.out.println("---------------------");

        List<String> list1 = Arrays.asList("Jonny", "David", "Duke", "Jill", "Dany", "Julia", "Jenis", "Divya");
        List<String> list2 = Arrays.asList("Jonny", "David", "Duke", "Jill", "Dany", "Julia", "Jenis", "Divya");

        Optional<String> findFirst = list1.parallelStream().filter(s->s.startsWith("D")).findFirst();
        Optional<String> findAny = list2.parallelStream().filter(s->s.startsWith("J")).findAny();

        System.out.println(findFirst.get());
        System.out.println(findAny.get());

        Optional<String> findFirst1 = list1.stream().filter(s->s.startsWith("D")).findFirst();
        Optional<String> findAny1 = list2.stream().filter(s->s.startsWith("J")).findAny();

        System.out.println(findFirst1.get());
        System.out.println(findAny1.get());

        // .min() AND .max()
        System.out.println("----- .min() AND .max() -----");
        Optional<Dish> dMin = DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(dMin.get());

        Optional<Dish> dMax = DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(dMax.get());

        // .reduce()
        System.out.println("----- .reduce() -----");
        int calTotal = DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce(Integer::sum).get(); // .reduce((a,b)->a+b).get();
        System.out.println(calTotal);


    }
}
