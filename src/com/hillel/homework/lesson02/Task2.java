package com.hillel.homework.lesson02;

public class Task2 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println(" a = " + a);
        System.out.println(" b = " + b + "\n");

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(" a = " + a);
        System.out.println(" b = " + b);

    }

}
