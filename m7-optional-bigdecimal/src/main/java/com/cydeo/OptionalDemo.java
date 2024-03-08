package com.cydeo;

import com.cydeo.java9.FactoryMethodsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2, 4, 2, 10, 23);

        // .empty()    // .isPresent() // Optional --> preventing NullPointerException

        System.out.println("----- .empty(), .isPresent() -----" );

        Optional<String> empty = Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isPresent());
        System.out.println(Optional.of(number).isPresent());

        //ifPresent
        System.out.println("----- .ifPresent() -----");
        Optional<Integer> bigNumber = number.stream().filter(x -> x > 100).findAny();
        bigNumber.ifPresent(System.out::println);

        // .get()
       // System.out.println(bigNumber.get());

        // .orElse
        System.out.println(bigNumber.orElse(5));

        System.out.println("----------------");
        System.out.println("Module Demo (module created to access module-8 !)");

        FactoryMethodsDemo moduleDemo = new FactoryMethodsDemo();
//      FactoryMethodsDemo class is under module8-->java9 package
//      access to java9 package is given by module-info.java class! (export - require)

//        ModuleExample moduleExample = new ModuleExample;
//        ModuleExample class is under module8-->java10 package
//        access to java10 package is not given only java9 given



    }
}
