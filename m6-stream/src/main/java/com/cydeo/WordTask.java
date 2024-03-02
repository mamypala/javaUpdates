package com.cydeo;

import java.util.Arrays;
import java.util.List;

public class WordTask {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("JAVA", "APPLE", "HONDA", "DEVELOPER");

        words.stream()
                .map(String::length) // .map(str -> str.length())
                .forEach(System.out::println);

    }
}
/*
Task:
Given a list of words, print the number of characters for each word.
Eg.
List<String> words = Arrays.asList("JAVA", "APPLE", "HONDA", "DEVELOPER");
 */
