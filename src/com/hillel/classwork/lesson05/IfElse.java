package com.hillel.classwork.lesson05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElse {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число: ");

        int number = Integer.parseInt(reader.readLine());
        System.out.println("Ваше число: " + number);

        if (number > 100) {
            System.out.println("Число больше 100");
        }

        if (number > 5 && number < 10) {
            System.out.println("Ваше число больше 5, но меньше 10");
        } else if (number > 10 && number < 20) {
            System.out.println("Ваше число больше 10, но меньше 20");
        } else if (number >= 20 && number < 30) {
            System.out.println("Ваше число больше 20, но меньше 30");
        } else {
            System.out.println("Другое число");
        }
    }

}