package com.hillel.homework.lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sequence {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Введите размер массива: ");
        int[] numbers = new int[Integer.parseInt(READER.readLine())];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введите " + i + " элемент: ");
            numbers[i] = Integer.parseInt(READER.readLine());
        }

        int index = 0; // Если это число остаёться нулём - массив возрастает, а если становиться единицей - значит нет

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                index = 1;
            } else {
                index = 0;
            }

        }

        if (numbers.length <= 1) {
            System.out.println("В массиве меньше двух чисел");
        } else if (index == 0) {
            System.out.println("Массив возрастает");
        } else {
            System.out.println("Массив убывает");
        }

    }
}