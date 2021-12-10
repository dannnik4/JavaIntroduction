package com.hillel.homework.lesson03;

public class Math {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = 15;

        // |a - b| / (a + b) ^3 - √c

        double result = java.lang.Math.abs(a - b) / java.lang.Math.pow((a + b), 3) - java.lang.Math.pow(c, 0.5);

        System.out.println(result);

    }

}
