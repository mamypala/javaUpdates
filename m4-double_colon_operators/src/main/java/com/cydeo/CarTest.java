package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {

        // ZeroArgument Constructor

        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car::new;
        System.out.println(c2.get().getModel());

        // OneArgument Constructor

        Function<Integer, Car> c3 = model -> new Car(model);

        Function<Integer, Car> c4 = Car::new;

        // TwoArgument Constructor
        BiFunction<String, Integer, Car> c5 = (model, make) -> new Car(model, make);

        BiFunction<String, Integer, Car> c6 = Car::new;
        Car honda = c6.apply("Honda", 2020);
        System.out.println(honda.getMake() + " " + honda.getModel());




    }
}
