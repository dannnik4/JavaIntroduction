package com.hillel.homework.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialNumber {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Введите число: ");
        int number = Integer.parseInt(READER.readLine());
        System.out.println("Факториал числа " + number + " равен " + factorial(number));

    }

    public static int factorial(int number) {
        if (number == 1) {
            return number;
        }
        return number * factorial(number - 1);
    }
}