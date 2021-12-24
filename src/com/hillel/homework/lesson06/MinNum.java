package com.hillel.homework.lesson06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinNum {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первое число:");
        int num1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите второе число:");
        int num2 = Integer.parseInt(reader.readLine());
        System.out.println("Введите третье число:");
        int num3 = Integer.parseInt(reader.readLine());

        printMin(num1, num2, num3);

    }

    public static void printMin(int num1, int num2, int num3) {
        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Какие-то из чисел одинаковые");
        } else if (num1 < num2 && num1 < num3) {
            System.out.println("Первое число (" + num1 + ") - минимальное");
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("Второе число (" + num2 + ") - минимальное");
        } else if (num3 < num1 && num3 < num2) {
            System.out.println("Второе число (" + num3 + ") - минимальное");
        } else {
            System.out.println("Ошибка");
        }
    }

}