package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        list.forEach(System.out::println);

        // INTERMEDIATE OPERATIONS

        // .filter()
        System.out.println("---- .filter() method ----");
        list.stream()
                .filter(i->i%2==0)
                .forEach(System.out::println);
        System.out.println("----------------------------");

        // .distinct()
        System.out.println("---- .distinct() method ----");
        Stream<Integer> str = list.stream()
                .filter(i -> i%2 == 0)
                .distinct();
        str.forEach(System.out::println);
        System.out.println("----------------------------");

        // .limit()
        System.out.println("---- .limit() method ----");
        list.stream()
                .filter(i -> i%2 == 0)
                .limit(1)
                .forEach(System.out::println);
        System.out.println("----------------------------");

        // skip.()
        System.out.println("---- .skip() method ----");
        list.stream()
                .filter(i -> i%2 == 0)
                .skip(1)
                .forEach(System.out::println);
        System.out.println("----------------------------");

        // map.()
        System.out.println("---- .map() method ----");
        list.stream()
              //  .filter(i -> i%2 == 0)
                .map(i -> i*3) // changing object
                .filter(i -> i%3==0)
                .forEach(System.out::println);


    }
}
