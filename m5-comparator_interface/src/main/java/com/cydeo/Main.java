package com.cydeo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 0, 15, 5, 20);
        System.out.println(list);

        // Ascending sorting
        Collections.sort(list);
        System.out.println(list);

        // Descending order
        Collections.sort(list, new MyComparator()); // list.sort(new MyComparator());
        System.out.println(list);

        Collections.sort(list, (o1, o2) -> (o1 > o2)? -1 : (o1 < o2) ? 1 : 0); // list.sort((o1, o2) -> o2.compareTo(o1));

        System.out.println("------------------------");

        // Ascending order
        System.out.println("Ascending order");
        list.sort((o1, o2) -> o1.compareTo(o2)); // list.sort(Integer::compareTo);
        System.out.println(list);

        // Descending order
        System.out.println("Descending order");
        list.sort((o2, o1) -> o1.compareTo(o2));
        System.out.println(list);

        System.out.println("---------------");

    }
}
