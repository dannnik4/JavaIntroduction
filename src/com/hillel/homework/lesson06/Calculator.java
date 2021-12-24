package com.hillel.homework.lesson06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первое число:");
        int num1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите оператор:");
        String operator = reader.readLine();
        System.out.println("Введите второе число:");
        int num2 = Integer.parseInt(reader.readLine());

        printPrimer(num1, num2, operator);
        sum(num1, num2);
        razn(num1, num2);
        del(num1, num2);
        umn(num1, num2);
        printResult(num1, num2, operator);

    }

    public static void printPrimer(int num1, int num2, String operator) {
        System.out.println(num1 + " " + operator + " " + num2);
    }

    public static void printResult(int num1, int num2, String operator) {
        if (operator.equals("+")) {
            System.out.println("Ответ: " + sum(num1, num2));
        } else if (operator.equals("-")) {
            System.out.println("Ответ: " + razn(num1, num2));
        } else if (operator.equals("/")) {
            System.out.println("Ответ: " + del(num1, num2));
        } else if (operator.equals("*")) {
            System.out.println("Ответ: " + umn(num1, num2));
        } else {
            System.out.println("Вы ввели неправильный оператор");
        }
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int razn(int num1, int num2) {
        return num1 - num2;
    }

    public static int del(int num1, int num2) {
        return num1 / num2;
    }

    public static int umn(int num1, int num2) {
        return num1 * num2;
    }

}