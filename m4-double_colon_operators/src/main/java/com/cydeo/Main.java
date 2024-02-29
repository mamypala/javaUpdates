package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class Main {

    public static void main(String[] args) {

//        Predicate<Integer> pred = (p) -> p%2 == 0 ? true : false;

        Calculate sum = (x, y) -> System.out.println(x+y);
        Calculate sum1 = (x, y) -> Calculator.findSum(x, y);

        // Reference to a Static Method
        Calculate sum2 = Calculator::findSum;
        sum2.calculate(10, 30);

        //Reference to an Instance method
        Calculator obj = new Calculator();
        Calculate s3 = obj :: findMultiply;

        Calculate s4 = new Calculator() :: findMultiply;

        BiFunction<String, Integer, String> function = (str, i) -> str.substring(i);
        BiFunction<String, Integer, String> function1 = String :: substring;

        Function<Integer, Double> b = new MyClass() :: method;
        BiFunction<MyClass, Integer, Double> b1 = MyClass :: method;

        Consumer<Integer> display = i -> System.out.println(i);
        Consumer<Integer> display1 = System.out::println;


    }
}
