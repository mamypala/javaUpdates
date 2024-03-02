package com.cydeo.employeeTask;

import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        // Print all emails
        System.out.println("Print all emails");
        EmployeeData.readAll()
                .map(Employee::getEmpEmail) // .map(emp -> emp.getEmpEmail())
                .forEach(System.out::println);
        System.out.println("---------------");

        // Print all Phone Numbers
        System.out.println("Print all Phone Numbers");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumber)
                .forEach(System.out::println);

        System.out.println("---------- .flatmap()-----------");
        EmployeeData.readAll()
                        .flatMap(emp -> emp.getEmpPhoneNumber().stream())
                        .forEach(System.out::println);
        System.out.println("---------------");

        System.out.println("With double colon");
        EmployeeData.readAll()
                        .map(Employee::getEmpPhoneNumber)
                        .flatMap(List::stream)
                        .forEach(System.out::println);





    }
}
