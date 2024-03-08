package com.cydeo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {

    public static void main(String[] args) {

        double amount1 = 374.56;
        double amount2 = 374.26;

        System.out.println(amount1 - amount2);

        BigDecimal b1 = new BigDecimal("374.56");
        BigDecimal b2 = new BigDecimal("374.26");
        System.out.println(b1.subtract(b2));

        BigDecimal b3 = BigDecimal.valueOf(374.56);
        BigDecimal b4 = BigDecimal.valueOf(374.26);
        System.out.println(b3.subtract(b4));

        BigDecimal b5 = BigDecimal.TEN;
        BigDecimal b6 = BigDecimal.ONE;

        System.out.println(b5.subtract(b6));
        System.out.println(b1.add(BigDecimal.TEN));
        System.out.println(b1.multiply(new BigDecimal("15.00")));
        System.out.println(b1.multiply(BigDecimal.valueOf(15.56)));


        // Scaling
        System.out.println("----- Scaling -----");

        BigDecimal num1 = new BigDecimal("23.35");
        System.out.println(num1.setScale(1, RoundingMode.CEILING)); // 1 basamak yukarı yuvarla
        System.out.println(num1.setScale(2, RoundingMode.CEILING)); // 2 basamak göster

        System.out.println(num1.setScale(1, RoundingMode.FLOOR)); // 1 basamak aşağı
        System.out.println(num1.setScale(2, RoundingMode.FLOOR)); // 2 basamak göster

        // Do not use .equals() use .compareTo()
        System.out.println("-out- .equals() --- -in- .compareTo()");
        System.out.println(new BigDecimal("2").compareTo(new BigDecimal(2))); // 0 eşit
        System.out.println(new BigDecimal("3").compareTo(new BigDecimal(2))); // 1 büyük
        System.out.println(new BigDecimal("1").compareTo(new BigDecimal(2))); // -1 küçük





    }
}
